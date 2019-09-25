package io.sportgift.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Actions model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name"})
@ToString
@Getter
@Setter
public class Actions {
	
    @Id
    private Integer id;
    
    private String name;
    
    private Sports sport;
    
    private short status;

}
