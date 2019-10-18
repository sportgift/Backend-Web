package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.Sports;

public interface ISportsRepository  extends PagingAndSortingRepository<Sports, Integer>  {

}
