package io.sportgift.dao;

import io.sportgift.model.Country;
import org.springframework.data.repository.CrudRepository;

/**
 * Country Dao.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
public interface ICountryDao extends CrudRepository<Country, Long> {
}
