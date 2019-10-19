package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Advertising;

/**
 * Advertising Repository
 * 
 * @author Christian
 *
 */
public interface IAdvertisingRepository  extends PagingAndSortingRepository<Advertising, Integer> {

}
