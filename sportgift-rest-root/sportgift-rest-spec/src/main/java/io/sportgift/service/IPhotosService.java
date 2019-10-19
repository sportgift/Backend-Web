package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.Photos;

/**
 * Photo service
 * 
 * @author Christian
 *
 */
public interface IPhotosService {
	
	 /**
     * Get the photo by id.
     *
     * @param id The phot id
     * @return The photo if exist
     */
    Optional<Photos> get(Integer id);

}
