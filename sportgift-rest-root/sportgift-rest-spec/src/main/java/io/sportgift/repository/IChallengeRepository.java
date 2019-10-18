package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Challenge;

public interface IChallengeRepository extends PagingAndSortingRepository<Challenge, Integer> {

}
