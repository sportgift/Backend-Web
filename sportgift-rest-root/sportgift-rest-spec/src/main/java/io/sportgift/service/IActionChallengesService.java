package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.ActionChallenges;

/**
 * ActionChallenges Service
 * 
 * @author Christian
 *
 */
public interface IActionChallengesService {
	
    /**
     * Get the ActionChallenges by id.
     *
     * @param id The ActionChallenges id
     * @return The ActionChallenges if exist
     */
    Optional<ActionChallenges> get(Integer id);

}
