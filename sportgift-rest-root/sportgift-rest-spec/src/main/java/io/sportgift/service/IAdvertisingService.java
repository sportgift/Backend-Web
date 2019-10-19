package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.Advertising;

/**
 * Advertising Service
 * 
 * @author Christian
 *
 */
public interface IAdvertisingService {
	
    /**
     * Get the Advertising by id.
     *
     * @param id The Advertising id
     * @return The Advertising if exist
     */
    Optional<Advertising> get(Integer id);
}
