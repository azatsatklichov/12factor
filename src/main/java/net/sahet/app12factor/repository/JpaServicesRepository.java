package net.sahet.app12factor.repository;


import net.sahet.app12factor.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaServicesRepository extends JpaRepository<Movie, Long> {
    
}
