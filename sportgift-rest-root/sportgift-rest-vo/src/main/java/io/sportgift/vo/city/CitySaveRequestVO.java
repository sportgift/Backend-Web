package io.sportgift.vo.city;

import lombok.Getter;
import lombok.Setter;

/**
 * City Save Request VO.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@Getter
@Setter
public class CitySaveRequestVO {
    private Long countryId;

    private String name;
}
