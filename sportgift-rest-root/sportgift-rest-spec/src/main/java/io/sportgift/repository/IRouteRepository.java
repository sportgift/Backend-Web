package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Route;

public interface IRouteRepository extends PagingAndSortingRepository<Route, Integer>  {

}
