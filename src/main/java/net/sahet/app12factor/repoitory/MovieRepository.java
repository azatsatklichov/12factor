package net.sahet.app12factor.repoitory;

import net.sahet.app12factor.domain.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MovieRepository  extends CrudRepository<Movie, Long> {

    List<Movie> findByName(String name);

    Optional<Movie> findById(Long longs);
}
