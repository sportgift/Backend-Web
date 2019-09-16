package io.sportgift.mapper;

import io.sportgift.model.City;
import io.sportgift.model.Competitor;
import io.sportgift.vo.city.CitySaveRequestVO;
import io.sportgift.vo.competitor.CompetitorSaveRequestVO;

import java.util.function.Function;

/**
 * City Mapper.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public abstract class CompetitorMapper {

    public static Function<CompetitorSaveRequestVO, Competitor> competitorSaveRequestVOCompetitor = requestVO -> new City(citySaveRequestVO.getCountryId(), citySaveRequestVO.getName());
}
