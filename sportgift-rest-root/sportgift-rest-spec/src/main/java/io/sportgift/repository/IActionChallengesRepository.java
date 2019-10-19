package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.ActionChallenges;

/**
 * ActionChallenges Repository
 * 
 * @author Christian
 *
 */
public interface IActionChallengesRepository extends PagingAndSortingRepository<ActionChallenges, Integer>  {

}
