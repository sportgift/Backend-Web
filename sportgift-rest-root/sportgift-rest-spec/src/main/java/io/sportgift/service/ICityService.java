package io.sportgift.service;

import io.sportgift.model.City;

import java.util.Optional;
import java.util.Set;

/**
 * City Service.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICityService {

    /**
     * Save.
     *
     * @param city The city to save
     * @return The city saved
     */
    City save(City city);

    /**
     * Get the city by id.
     *
     * @param id The city id
     * @return The city if exist
     */
    Optional<City> get(Long id);

    /**
     * Get All city by country id.
     *
     * @param size The page size
     * @param page The page index
     * @return The city list
     */
    Set<City> getAll(Long countryId, Long size, Long page);
}
