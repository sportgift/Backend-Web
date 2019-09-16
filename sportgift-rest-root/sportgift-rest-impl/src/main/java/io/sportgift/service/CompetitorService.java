package io.sportgift.service;

import io.sportgift.model.Competitor;
import io.sportgift.repository.ICompetitorRepository;
import org.springframework.stereotype.Service;

/**
 * Competitor Service.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@Service
public class CompetitorService implements ICompetitorService {
    private ICompetitorRepository competitorRepository;

    public CompetitorService(ICompetitorRepository competitorRepository) {
        this.competitorRepository = competitorRepository;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Competitor save(Competitor competitor) {
        return competitorRepository.save(competitor);
    }
}
