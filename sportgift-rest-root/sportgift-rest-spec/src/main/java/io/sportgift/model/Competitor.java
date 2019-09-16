package io.sportgift.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Competitor model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@EqualsAndHashCode(of = {"cityId", "name"})
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class Competitor {

    @Id
    private Long id;

    private final String name;

    private final String username;

    private final String password;

    private String avatar;

    private Float weight;

    private Float height;

    private final Character gender;

    private LocalDate dateBirth;

    private final Long cityId;

    private String address;

    private String facebook;

    private String instagram;

    private String twitter;

    private final LocalDateTime registration;

    private Boolean status;

}
