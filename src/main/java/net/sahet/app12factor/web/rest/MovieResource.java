package net.sahet.app12factor.web.rest;

import net.sahet.app12factor.domain.Movie;
import net.sahet.app12factor.repoitory.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieResource {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> retrieveAllStudents() {
        return (List<Movie>) movieRepository.findAll(); //Lists.newArrayList(recordRepository.findAll());
    }

    @GetMapping("/movies/{id}")
    public Movie retrieveStudent(@PathVariable Long id) {
        return movieRepository.findById(id).get();
    }

    @PostMapping("/movies")
    public Long createStudent(@RequestBody Movie movie) {
        return movieRepository.save(movie).getId();
    }
}
