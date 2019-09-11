package io.sportgift.mapper;

import io.sportgift.model.Country;
import io.sportgift.vo.country.CountrySaveRequestVO;

import java.util.function.Function;

public abstract class CountryMapper {

    public static Function<CountrySaveRequestVO, Country> countrySaveRequestVOCountry = countryRequest -> new Country(countryRequest.getName());
}
