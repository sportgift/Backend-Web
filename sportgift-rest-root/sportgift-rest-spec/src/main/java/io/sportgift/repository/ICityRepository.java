package io.sportgift.repository;

import java.util.Set;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import io.sportgift.model.City;

/**
 * City Repository.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICityRepository extends PagingAndSortingRepository<City, Integer> {

    @Query("SELECT * FROM city WHERE country_id = :countryId ORDER BY id LIMIT :size OFFSET :offset")
    Set<City> getAllByCountryId(@Param("countryId") Integer countryId, @Param("size") Integer size, @Param("offset") Integer offset);
}
