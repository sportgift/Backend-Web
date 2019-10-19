package io.sportgift.service;

import java.util.Optional;
import java.util.Set;

import io.sportgift.model.PromotionsAwards;

/**
 * PromotionsAwards Service
 * 
 * @author Christian
 *
 */
public interface IPromotionsAwardsService {

	
    /**
     * Save.
     *
     * @param promotionsAwards The PromotionsAwards to save
     * @return The PromotionsAwards saved
     */
	PromotionsAwards save(PromotionsAwards promotionsAwards);
	
	/**
    * Get the Promotions Awards by id.
    *
    * @param id The Promotions Awards id
    * @return The Promotions Awards if exist
    */
   Optional<PromotionsAwards> get(Integer id);
   
   /**
    * Get All PromotionsAwards by competitor id.
    *
    * @param size The page size
    * @param page The page index
    * @return The PromotionsAwards list
    */
   Set<PromotionsAwards> getAll(Integer promotionsAwardsId, Integer size, Integer page);   
   
}
