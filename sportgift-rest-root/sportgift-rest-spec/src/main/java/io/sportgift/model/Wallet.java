package io.sportgift.model;

import lombok.*;
import org.springframework.data.annotation.Id;

/**
 * Wallet model.
 *
 * @author Christian Domenech
 * @since 1.0.0
 */
@EqualsAndHashCode(of = {"competitorId","address"})
@ToString
@RequiredArgsConstructor
@Getter
@Setter
public class Wallet {

    @Id
    private Integer id;
    
    private String address;
    
    private Integer tokensWon;
    
    private Integer competitorId;
}
