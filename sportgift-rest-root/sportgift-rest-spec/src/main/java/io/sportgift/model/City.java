package io.sportgift.model;


import lombok.*;
import org.springframework.data.annotation.Id;

/**
 * City model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@EqualsAndHashCode(of = {"countryId", "name"})
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class City {

    @Id
    private Long id;
    private final Long countryId;
    private final String name;
}
