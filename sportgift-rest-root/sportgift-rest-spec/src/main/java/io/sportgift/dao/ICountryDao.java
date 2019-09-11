package io.sportgift.dao;

import io.sportgift.model.Country;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

/**
 * Country Dao.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICountryDao extends PagingAndSortingRepository<Country, Long> {


    @Query("SELECT * FROM country ORDER BY id lIMIT :size OFFSET :offset")
    Set<Country> getAll(@Param("size") Long size, @Param("offset") Long offset);
}
