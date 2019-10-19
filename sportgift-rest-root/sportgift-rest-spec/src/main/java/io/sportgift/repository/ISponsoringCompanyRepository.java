package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.SponsoringCompany;

/**
 * SponsoringCompany Repository
 * 
 * @author Christian
 *
 */
public interface ISponsoringCompanyRepository  extends PagingAndSortingRepository<SponsoringCompany, Integer>  {

}
