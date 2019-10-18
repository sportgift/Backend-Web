package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.PromotionsAwards;

/**
 * 
 * @author Christian
 *
 */
public interface IPromotionsAwardsService {

	
	 /**
    * Get the Promotions Awards by id.
    *
    * @param id The Promotions Awards id
    * @return The Promotions Awards if exist
    */
   Optional<PromotionsAwards> get(Integer id);
}
