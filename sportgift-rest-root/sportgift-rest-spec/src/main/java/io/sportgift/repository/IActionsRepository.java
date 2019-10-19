package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Actions;

/**
 *  Actions Repository
 *  
 * @author Christian
 *
 */
public interface IActionsRepository extends PagingAndSortingRepository<Actions, Integer> {

}
