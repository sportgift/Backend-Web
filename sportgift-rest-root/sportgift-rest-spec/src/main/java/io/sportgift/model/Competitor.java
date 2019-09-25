package io.sportgift.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
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
@Getter
@Setter
public class Competitor {

    @Id
    private Integer id;

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

    private LocalDateTime registration;

    private Short status;

    /**
     * Constructor.
     *
     * @param name
     * @param username
     * @param password
     * @param avatar
     * @param weight
     * @param height
     * @param gender
     * @param dateBirth
     * @param cityId
     * @param address
     * @param facebook
     * @param instagram
     * @param twitter
     * @param registration
     * @param booleanStatus
     */
    public Competitor(String name, String username, String password, String avatar, Float weight, Float height, Character gender, LocalDate dateBirth, Integer cityId, String address, String facebook, String instagram, String twitter, LocalDateTime registration, Boolean booleanStatus) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.cityId = cityId;
        this.address = address;
        this.facebook = facebook;
        this.instagram = instagram;
        this.twitter = twitter;
        this.registration = registration;
        if (booleanStatus) this.status = 1;
        else this.status = 0;
    }
}
