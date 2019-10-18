package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Photos;

public interface IPhotosRepository extends PagingAndSortingRepository<Photos, Integer>  {


}
