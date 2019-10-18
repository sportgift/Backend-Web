package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Actions;

public interface IActionsRepository extends PagingAndSortingRepository<Actions, Integer> {

}
