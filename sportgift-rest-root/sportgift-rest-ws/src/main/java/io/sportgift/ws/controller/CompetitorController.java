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
import io.sportgift.mapper.CompetitorMapper;
import io.sportgift.model.Competitor;
import io.sportgift.service.ICompetitorService;
import io.sportgift.vo.competitor.CompetitorSaveRequestVO;
import reactor.core.publisher.Mono;

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
    public Mono<Competitor> save(@RequestBody CompetitorSaveRequestVO competitorSaveRequestVO) {
        return Mono.justOrEmpty(competitorService.save(CompetitorMapper.competitorSaveRequestVOCompetitor.apply(competitorSaveRequestVO)));
    }

    @GetMapping("{id}")
    public Mono<Competitor> get(@PathVariable Integer id) {
        return Mono.justOrEmpty(competitorService.get(id));
    }

    @GetMapping
    public Mono<Set<Competitor>> getAll(@RequestParam(required = false, defaultValue = SportGiftConstants.PAGINATION_DEFAULT_PAGE_SIZE_AS_STRING) Integer size, @RequestParam Integer page) {
        return Mono.justOrEmpty(competitorService.getAll(size, page));
    }
}
