package io.sportgift.ws.controller;

import io.sportgift.mapper.CityMapper;
import io.sportgift.model.City;
import io.sportgift.service.ICityService;
import io.sportgift.service.ICompetitorService;
import io.sportgift.vo.city.CitySaveRequestVO;
import io.sportgift.vo.competitor.CompetitorSaveRequestVO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.Set;

/**
 * Competitor Controller.
 *
 * @author Eduardo Alfonso Sanchez
 * @since 1.0.0
 */
@RequestMapping("competitor")
@RestController
public class CompetitorController {

    private final ICompetitorService competitorService;

    public CompetitorController(ICompetitorService competitorService) {
        this.competitorService = competitorService;
    }

    @PostMapping
    public Mono<City> save(@RequestBody CompetitorSaveRequestVO competitorSaveRequestVO) {
        return Mono.justOrEmpty(competitorService.save(CityMapper.citySaveRequestVOCity.apply(competitorSaveRequestVO)));
    }

    @GetMapping("{id}")
    public Mono<City> get(@PathVariable Long id) {
        return Mono.justOrEmpty(cityService.get(id));
    }

    @GetMapping("country/{countryId}")
    public Mono<Set<City>> getAll(@PathVariable Long countryId, @RequestParam Long size, @RequestParam Long page) {
        return Mono.justOrEmpty(cityService.getAll(countryId, size, page));
    }
}
