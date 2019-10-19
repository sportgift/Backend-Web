package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.CompetitorChallenges;

/**
 * CompetitorChallenges Repository
 * 
 * @author Christian
 *
 */
public interface ICompetitorChallengesRepository extends PagingAndSortingRepository<CompetitorChallenges, Integer> {

}
