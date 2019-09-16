package io.sportgift.repository;

import io.sportgift.model.Competitor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Competitor Repository.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICompetitorRepository extends PagingAndSortingRepository<Competitor, Long> {
}
