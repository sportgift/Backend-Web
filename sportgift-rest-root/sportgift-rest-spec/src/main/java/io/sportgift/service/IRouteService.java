package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.Route;

/**
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

}
