package io.sportgift.service;

import java.util.Optional;

import io.sportgift.model.Wallet;

/**
 * 
 * @author Christian
 *
 */
public interface IWalletService {
	
	 /**
     * Get the wallet by id.
     *
     * @param id The wallet id
     * @return The wallets if exist
     */
    Optional<Wallet> get(Integer id);

}
