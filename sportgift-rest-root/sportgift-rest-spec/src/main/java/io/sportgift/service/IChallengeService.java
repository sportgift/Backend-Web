package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.Challenge;

/**
 * Challenge Service
 * 
 * @author Christian
 *
 */
public interface IChallengeService {

    /**
     * Get the Challenge by id.
     *
     * @param id The Challenge id
     * @return The Challenge if exist
     */
    Optional<Challenge> get(Integer id);
	
}
