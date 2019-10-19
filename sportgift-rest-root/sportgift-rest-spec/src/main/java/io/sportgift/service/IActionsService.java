package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.Actions;

/**
 * Actions Service
 * 
 * @author Christian
 *
 */
public interface IActionsService {
	
    /**
     * Get the Actions by id.
     *
     * @param id The Actions id
     * @return The Actions if exist
     */
    Optional<Actions> get(Integer id);

}
