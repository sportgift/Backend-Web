package io.sportgift.ws.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.sportgift.common.SportGiftConstants;
import io.sportgift.mapper.CountryMapper;
import io.sportgift.model.Country;
import io.sportgift.service.ICountryService;
import io.sportgift.vo.country.CountrySaveRequestVO;
import reactor.core.publisher.Mono;

/**
 * Country Controller.
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@RequestMapping("country")
@RestController
public class CountryController {

   private final ICountryService countryService;

    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping
    public Mono<Country> save(@RequestBody CountrySaveRequestVO countrySaveRequestVO) {
        return Mono.justOrEmpty(countryService.save(CountryMapper.countrySaveRequestVOCountry.apply(countrySaveRequestVO)));
    }

    @GetMapping("{id}")
    public Mono<Country> get(@PathVariable Integer id) {
        return Mono.justOrEmpty(countryService.get(id));
    }

    @GetMapping
    public Mono<Set<Country>> getAll(@RequestParam(required = false, defaultValue = SportGiftConstants.PAGINATION_DEFAULT_PAGE_SIZE_AS_STRING) Integer size, @RequestParam Integer page) {
        return Mono.justOrEmpty(countryService.getAll(size, page));
    }
}
