package io.sportgift.service;

import io.sportgift.repository.ICountryRepository;
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

    private final ICountryRepository countryDao;

    public CountryService(ICountryRepository countryDao) {
        this.countryDao = countryDao;
    }

    @Override
    public Country save(Country country) {
        return countryDao.save(country);
    }

    @Override
    public Optional<Country> get(Integer id) {
        return countryDao.findById(id);
    }

    @Override
    public Set<Country> getAll(Integer size, Integer page) {
        return countryDao.getAll(size, size*page);
    }

}
