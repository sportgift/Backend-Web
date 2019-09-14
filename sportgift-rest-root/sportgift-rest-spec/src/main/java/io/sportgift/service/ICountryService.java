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

    /**
     * Save.
     *
     * @param country The country to save
     * @return The country saved
     */
    Country save(Country country);

    /**
     * Get the country by id.
     *
     * @param id The country id
     * @return The country if exist
     */
    Optional<Country> get(Long id);

    /**
     * Get all Country.
     *
     * @param size The size of page
     * @param page The page index
     * @return The list of country
     */
    Set<Country> getAll(Long size, Long page);
}