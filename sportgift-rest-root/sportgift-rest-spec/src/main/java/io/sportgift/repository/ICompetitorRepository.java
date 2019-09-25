package io.sportgift.repository;

import io.sportgift.common.SportGiftConstants;
import io.sportgift.model.Competitor;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Set;

/**
 * Competitor Repository.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICompetitorRepository extends PagingAndSortingRepository<Competitor, Integer> {

    @Query("SELECT id,  name, city_id, username, '" + SportGiftConstants.PASSWORD_HIDE + "' as password,  avatar, weight, height, gender, date_birth, address, facebook, instagram, twitter, registration, status FROM competitor  ORDER BY id LIMIT :size OFFSET :offset")
    Set<Competitor> getAll(@Param("size") Integer size, @Param("offset") Integer offset);
}
