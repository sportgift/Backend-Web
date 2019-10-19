package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Route;

/**
 * Route Repository
 * 
 * @author Christian
 *
 */
public interface IRouteRepository extends PagingAndSortingRepository<Route, Integer>  {

}
