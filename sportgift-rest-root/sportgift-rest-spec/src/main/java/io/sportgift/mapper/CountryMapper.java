package io.sportgift.mapper;

import java.util.function.Function;

import io.sportgift.model.Country;
import io.sportgift.vo.country.CountrySaveRequestVO;

/**
 * Country Mapper.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public abstract class CountryMapper {

    public static Function<CountrySaveRequestVO, Country> countrySaveRequestVOCountry = countryRequest -> new Country(countryRequest.getName());
}
