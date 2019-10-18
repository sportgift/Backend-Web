package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.CompetitorChallenges;

public interface ICompetitorChallengesRepository extends PagingAndSortingRepository<CompetitorChallenges, Integer> {

}
