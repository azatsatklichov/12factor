package net.sahet.app12factor.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private Long id;
    private String title;
    private String year;
    private String rating;
}
