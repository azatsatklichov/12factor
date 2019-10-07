package net.sahet.app12factor.service;

import lombok.extern.slf4j.Slf4j;
import net.sahet.app12factor.domain.Book;
import net.sahet.app12factor.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class BookService {

    @Autowired
    private BookRepository repository;

    public String getBookById(long id) {
        Optional<Book> bookById = repository.findById(id);
        return bookById.isPresent() ? bookById.get().getName() : "";
    }

    public List<Book> getAllBooks(String name) {
        return repository.findByName(name);
    }
}
