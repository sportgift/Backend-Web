package io.sportgift.model;

import lombok.*;
import org.springframework.data.annotation.Id;

/**
 * Country model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@EqualsAndHashCode(of = "name")
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class Country {
    @Id
    private Integer id;
    private final String name;
}
