package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.Sports;

/**
 * Sports service
 * 
 * @author Christian
 *
 */
public interface ISportsService {
	
	 /**
     * Get the sport by id.
     *
     * @param id The sport id
     * @return The sport if exist
     */
    Optional<Sports> get(Integer id);

}
