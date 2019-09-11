package io.sportgift.service;

import io.sportgift.model.Country;

import java.util.Optional;
import java.util.Set;

/**
 * Country Service.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICountryService {

    Country save(Country country);

    Optional<Country> get(Long id);

    Iterable<Country> getAll();

    Set<Country> getAll(Long size, Long page);
}
