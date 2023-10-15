package net.sahet.app12factor;

import lombok.extern.slf4j.Slf4j;
import net.sahet.app12factor.domain.Book;
import net.sahet.app12factor.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableJpaAuditing
@Slf4j
public class Application implements CommandLineRunner {


    @Autowired
    private BookRepository repository;

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) {

        log.info("StartApplication...");

        repository.save(new Book("Java"));
        repository.save(new Book("Angular"));
        repository.save(new Book("Scala"));//Python

        System.out.println("\nfindAll()");
        repository.findAll().forEach(x -> System.out.println(x));

        System.out.println("\nfindById(1L)");
        repository.findById(1l).ifPresent(x -> System.out.println(x));

        System.out.println("\nfindByName('Node')");
        repository.findByName("Node").forEach(x -> System.out.println(x));

    }
}
