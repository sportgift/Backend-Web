package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Advertising;

public interface IAdvertisingRepository  extends PagingAndSortingRepository<Advertising, Integer> {

}
