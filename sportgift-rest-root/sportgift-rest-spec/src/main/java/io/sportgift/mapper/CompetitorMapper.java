package io.sportgift.mapper;

import io.sportgift.model.Competitor;
import io.sportgift.vo.competitor.CompetitorSaveRequestVO;

import java.time.LocalDateTime;
import java.util.function.Function;

/**
 * City Mapper.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public abstract class CompetitorMapper {

    public static Function<CompetitorSaveRequestVO, Competitor> competitorSaveRequestVOCompetitor = vo ->
            new Competitor(vo.getName(), vo.getUsername(), vo.getPassword(), vo.getAvatar(),
                    vo.getWeight(), vo.getHeight(), vo.getGender(), vo.getDateBirth(),
                    vo.getCityId(), vo.getAddress(), vo.getFacebook(), vo.getInstagram(),
                    vo.getTwitter(), LocalDateTime.now(), Short.valueOf("1"));
}
