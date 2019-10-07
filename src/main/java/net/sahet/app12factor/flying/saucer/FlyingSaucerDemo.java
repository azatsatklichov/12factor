package net.sahet.app12factor.flying.saucer;

import com.lowagie.text.DocumentException;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FlyingSaucerDemo {

    public static void main(String[] args) throws IOException, DocumentException {
        System.out.println("Welcome to Flying Saucer Demo :) ");
        ClassLoaderTemplateResolver classLoaderTemplateResolver = new ClassLoaderTemplateResolver();
        classLoaderTemplateResolver.setSuffix(".html");
        classLoaderTemplateResolver.setTemplateMode("HTML");

        TemplateEngine templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(classLoaderTemplateResolver);

        Context context = new Context();
        context.setVariable("name", "IamAwesome");

        String htmlText = templateEngine.process("template", context);

        try (OutputStream outputStream = new FileOutputStream("report.pdf")) {
            ITextRenderer renderer = new ITextRenderer();
            renderer.setDocumentFromString(htmlText);
            renderer.layout();
            renderer.createPDF(outputStream);
        }
    }
}
