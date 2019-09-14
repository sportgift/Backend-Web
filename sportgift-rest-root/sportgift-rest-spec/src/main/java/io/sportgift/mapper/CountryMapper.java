package io.sportgift.mapper;

import io.sportgift.model.Country;
import io.sportgift.vo.country.CountrySaveRequestVO;

import java.util.function.Function;

/**
 * Country Mapper.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public abstract class CountryMapper {

    public static Function<CountrySaveRequestVO, Country> countrySaveRequestVOCountry = countryRequest -> new Country(countryRequest.getName());
}
