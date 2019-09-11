package io.sportgift.model;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

/**
 * Country model.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */

public class Country {
    @Id
    private Long id;
    private String name;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
