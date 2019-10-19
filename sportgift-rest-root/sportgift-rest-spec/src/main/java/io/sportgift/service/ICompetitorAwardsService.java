package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.CompetitorAwards;

/**
 * CompetitorAwards Service
 * 
 * @author Christian
 *
 */
public interface ICompetitorAwardsService {
	
	 /**
     * Get the CompetitorAwards by id.
     *
     * @param id The CompetitorAwards id
     * @return The CompetitorAwards if exist
     */
    Optional<CompetitorAwards> get(Integer id);

}
