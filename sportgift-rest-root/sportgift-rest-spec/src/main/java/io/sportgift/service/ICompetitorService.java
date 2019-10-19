package io.sportgift.service;

import java.util.Optional;
import java.util.Set;

import io.sportgift.model.Competitor;

/**
 * Competitor Service.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICompetitorService {

    /**
     * Save.
     *
     * @param competitor The competitor to save
     * @return The competitor saved
     */
    Competitor save(Competitor competitor);

    /**
     * Get the competitor by id.
     *
     * @param id The competitor id
     * @return The competitor if exist
     */
    Optional<Competitor> get(Integer id);
    
    /**
     * Get All Competitor by competitor id.
     *
     * @param size The page size
     * @param page The page index
     * @return The Competitor list
     */
    Set<Competitor> getAll(Integer competitorId, Integer size, Integer page);

}
