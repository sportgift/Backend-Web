package io.sportgift.vo.competitor;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

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

    private Integer cityId;

    private String address;

    private String facebook;

    private String instagram;

    private String twitter;
}
