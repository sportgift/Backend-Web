package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.CoordinatesRoute;
import io.sportgift.model.Country;

/**
 * CoordinatesRoute Service
 * 
 * @author Christian
 *
 */
public interface ICoordinatesRouteService {

    /**
     * Save.
     *
     * @param coordinatesRoute The CoordinatesRoute to save
     * @return The CoordinatesRoute saved
     */
    Country save(CoordinatesRoute coordinatesRoute);

    /**
     * Get the CoordinatesRoute by id.
     *
     * @param id The CoordinatesRoute id
     * @return The CoordinatesRoute if exist
     */
    Optional<CoordinatesRoute> get(Integer id);
	
}
