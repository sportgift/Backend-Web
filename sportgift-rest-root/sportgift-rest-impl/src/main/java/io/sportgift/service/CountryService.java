package io.sportgift.service;

import io.sportgift.dao.ICountryDao;
import io.sportgift.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Default implementation of {@link ICountryService}.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@Service
public class CountryService implements ICountryService {

    private final ICountryDao countryDao;

    public CountryService(ICountryDao countryDao) {
        this.countryDao = countryDao;
    }

    @Override
    public Country save(Country country) {
        return countryDao.save(country);
    }
}
