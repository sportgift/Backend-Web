package io.sportgift.service;

import java.util.Optional;
import java.util.Set;

import io.sportgift.model.City;
import io.sportgift.model.Competitor;
import io.sportgift.model.Route;

/**
 * Route Service
 * 
 * @author Christian
 *
 */
public interface IRouteService {
	
	 /**
     * Get the Route by id.
     *
     * @param id The Route id
     * @return The Route if exist
     */
    Optional<Route> get(Integer id);
    
    /**
     * Save.
     *
     * @param route The Route to save
     * @return The Route saved
     */
    Competitor save(Route route);
    
    /**
     * Get All route by country id.
     *
     * @param size The page size
     * @param page The page index
     * @return The Route list
     */
    Set<City> getAll(Integer routeId, Integer size, Integer page);

}
