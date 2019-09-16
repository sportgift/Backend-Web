package io.sportgift.service;

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
}
