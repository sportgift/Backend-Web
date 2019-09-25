package io.sportgift.service;

import io.sportgift.model.City;
import io.sportgift.repository.ICityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Default City Service.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@Service
public class CityService implements ICityService {

    private ICityRepository cityRepository;

    /**
     * Constructor.
     *
     * @param cityRepository The {@link ICityRepository}
     */
    public CityService(ICityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<City> get(Integer id) {
        return cityRepository.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Set<City> getAll(Integer countryId, Integer size, Integer page) {
        return cityRepository.getAllByCountryId(countryId, size, size * page);
    }
}
