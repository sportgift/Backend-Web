package io.sportgift.service;

import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import io.sportgift.common.SportGiftConstants;
import io.sportgift.model.Competitor;
import io.sportgift.repository.ICompetitorRepository;

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
        Competitor save = competitorRepository.save(competitor);
        save.setPassword(SportGiftConstants.PASSWORD_HIDE);
        return save;
    }

    @Override
    public Optional<Competitor> get(Integer id) {
        Optional<Competitor> competitorOptional = competitorRepository.findById(id);
        competitorOptional.ifPresent(competitor -> competitor.setPassword(SportGiftConstants.PASSWORD_HIDE));
        return competitorOptional;
    }

    @Override
    public Set<Competitor> getAll(Integer size, Integer page) {
        return competitorRepository.getAll(size, size*page);
    }
}
