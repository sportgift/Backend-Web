package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.CompetitorAwards;

/**
 * CompetitorAwards Repository
 * 
 * @author Christian
 *
 */
public interface ICompetitorAwardsRepository  extends PagingAndSortingRepository<CompetitorAwards, Integer> {


}
