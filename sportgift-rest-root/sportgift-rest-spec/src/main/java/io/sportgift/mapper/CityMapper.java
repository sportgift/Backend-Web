package io.sportgift.mapper;

import java.util.function.Function;

import io.sportgift.model.City;
import io.sportgift.vo.city.CitySaveRequestVO;

/**
 * City Mapper.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public abstract class CityMapper {

    public static Function<CitySaveRequestVO, City> citySaveRequestVOCity = citySaveRequestVO -> new City(citySaveRequestVO.getCountryId(), citySaveRequestVO.getName());
}
