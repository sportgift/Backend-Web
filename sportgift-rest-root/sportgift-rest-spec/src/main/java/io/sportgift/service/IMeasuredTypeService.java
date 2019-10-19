package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.MeasuredType;

/**
 * MeasuredType Service
 * 
 * @author Christian
 *
 */
public interface IMeasuredTypeService {

	 /**
     * Get the measuredType by id.
     *
     * @param id The MeasuredType id
     * @return The MeasuredType if exist
     */
    Optional<MeasuredType> get(Integer id);
	
}
