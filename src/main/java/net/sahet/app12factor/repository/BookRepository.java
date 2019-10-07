package net.sahet.app12factor.repository;

import net.sahet.app12factor.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

    Optional<Book> findById(Long longs);
}
