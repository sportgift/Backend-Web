package io.sportgift.repository;

import java.util.Set;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import io.sportgift.model.Wallet;

/**
 * Wallet Repository.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface IWalletRepository extends PagingAndSortingRepository<Wallet, Integer> {

    @Query("SELECT * FROM wallet WHERE competitor_id = :competitorId ORDER BY id LIMIT :size OFFSET :offset")
    Set<Wallet> getAllByCompetitorId(@Param("competitorId") Long competitorId, @Param("size") Long size, @Param("offset") Long offset);
}
