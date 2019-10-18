package io.sportgift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import io.sportgift.model.SponsoringCompany;

public interface ISponsoringCompanyRepository  extends PagingAndSortingRepository<SponsoringCompany, Integer>  {

}
