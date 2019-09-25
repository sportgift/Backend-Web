package io.sportgift.repository;

import io.sportgift.model.Country;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

/**
 * Country Repository.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICountryRepository extends PagingAndSortingRepository<Country, Integer> {

    @Query("SELECT * FROM country ORDER BY id LIMIT :size OFFSET :offset")
    Set<Country> getAll(@Param("size") Integer size, @Param("offset") Integer offset);
}
