package io.sportgift.repository;

import io.sportgift.model.City;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

/**
 * City Repository.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICityRepository extends PagingAndSortingRepository<City, Integer> {

    @Query("SELECT * FROM city WHERE country_id = :countryId ORDER BY id lIMIT :size OFFSET :offset")
    Set<City> getAllByCountryId(@Param("countryId") Long countryId, @Param("size") Long size, @Param("offset") Long offset);
}
