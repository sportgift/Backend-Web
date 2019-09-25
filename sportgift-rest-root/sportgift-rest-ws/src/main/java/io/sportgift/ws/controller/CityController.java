package io.sportgift.ws.controller;

import io.sportgift.common.SportGiftConstants;
import io.sportgift.mapper.CityMapper;
import io.sportgift.model.City;
import io.sportgift.service.ICityService;
import io.sportgift.vo.city.CitySaveRequestVO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Set;

/**
 * City Controller.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@RequestMapping("city")
@RestController
public class CityController {

    private final ICityService cityService;

    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping
    public Mono<City> save(@RequestBody CitySaveRequestVO citySaveRequestVO) {
        return Mono.justOrEmpty(cityService.save(CityMapper.citySaveRequestVOCity.apply(citySaveRequestVO)));
    }

    @GetMapping("{id}")
    public Mono<City> get(@PathVariable Long id) {
        return Mono.justOrEmpty(cityService.get(id));
    }

    @GetMapping("country/{countryId}")
    public Mono<Set<City>> getAll(@PathVariable Long countryId, @RequestParam(required = false, defaultValue = SportGiftConstants.PAGINATION_DEFAULT_PAGE_SIZE_AS_STRING) Long size, @RequestParam Long page) {
        return Mono.justOrEmpty(cityService.getAll(countryId, size, page));
    }
}
