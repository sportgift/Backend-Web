package io.sportgift.service;

import io.sportgift.dao.ICountryDao;
import io.sportgift.model.Country;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

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

    @Override
    public Optional<Country> get(Long id) {
        return countryDao.findById(id);
    }

    @Override
    public Iterable<Country> getAll() {
        return countryDao.findAll();
    }

    @Override
    public Set<Country> getAll(Long size, Long page) {
        return countryDao.getAll(size, size*page);
    }

}
