package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.SponsoringCompany;

/**
 * Sponsoring Company
 * 
 * @author Christian
 *
 */
public interface ISponsoringCompanyService {

	 /**
     * Get the Sponsoring company by id.
     *
     * @param id The Sponsoring Company id
     * @return The Sponsoring Company if exist
     */
    Optional<SponsoringCompany> get(Integer id);
}
