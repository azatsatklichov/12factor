package net.sahet.app12factor.web.controller;

import net.sahet.app12factor.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/getBook")
    public ModelAndView getBook() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("getBook");
        modelAndView.addObject("books", "You like: " + bookService.getBookById(1));
        return modelAndView;
    }

    ;

    @GetMapping(value = "/getAllBooks")
    public String getAllBooks() {
        return "All Java books are here: " + bookService.getAllBooks("Java");
    }

    ;

}
