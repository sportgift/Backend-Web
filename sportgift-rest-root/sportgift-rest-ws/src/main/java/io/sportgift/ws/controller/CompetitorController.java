package io.sportgift.ws.controller;

import io.sportgift.mapper.CompetitorMapper;
import io.sportgift.model.Competitor;
import io.sportgift.service.ICompetitorService;
import io.sportgift.vo.competitor.CompetitorSaveRequestVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
