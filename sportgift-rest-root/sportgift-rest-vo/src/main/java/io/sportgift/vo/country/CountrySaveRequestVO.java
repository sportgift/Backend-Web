package io.sportgift.vo.country;

import lombok.Getter;
import lombok.Setter;

/**
 * Country Save Request VO.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public class CountrySaveRequestVO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
