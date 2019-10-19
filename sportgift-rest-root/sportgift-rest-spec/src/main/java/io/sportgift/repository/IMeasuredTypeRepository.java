package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.MeasuredType;

/**
 * MeasuredType Repository
 * 
 * @author Christian
 *
 */
public interface IMeasuredTypeRepository extends PagingAndSortingRepository<MeasuredType, Integer>  {


}
