package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.CompetitorAwards;

public interface ICompetitorAwardsRepository  extends PagingAndSortingRepository<CompetitorAwards, Integer> {


}
