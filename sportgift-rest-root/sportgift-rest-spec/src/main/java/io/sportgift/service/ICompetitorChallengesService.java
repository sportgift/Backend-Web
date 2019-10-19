package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.CompetitorChallenges;

/**
 * CompetitorChallenge Service
 * 
 * @author Christian
 *
 */
public interface ICompetitorChallengesService {
	
    /**
     * Get the CompetitorChallenges by id.
     *
     * @param id The CompetitorChallenges id
     * @return The CompetitorChallenges if exist
     */
    Optional<CompetitorChallenges> get(Integer id);

}
