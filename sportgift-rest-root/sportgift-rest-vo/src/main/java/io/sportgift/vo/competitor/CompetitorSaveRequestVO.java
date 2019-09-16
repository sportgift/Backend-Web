package io.sportgift.vo.competitor;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Competitor Save Request VO.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@Getter
@Setter
public class CompetitorSaveRequestVO {

    private String name;

    private String username;

    private String password;

    private String avatar;

    private Float weight;

    private Float height;

    private Character gender;

    private LocalDate dateBirth;

    private Long cityId;

    private String address;

    private String facebook;

    private String instagram;

    private String twitter;
}
