package io.sportgift.mapper;

import io.sportgift.model.City;
import io.sportgift.vo.city.CitySaveRequestVO;

import java.util.function.Function;

/**
 * City Mapper.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public abstract class CityMapper {

    public static Function<CitySaveRequestVO, City> citySaveRequestVOCity = citySaveRequestVO -> new City(citySaveRequestVO.getCountryId(), citySaveRequestVO.getName());
}
