package io.sportgift.ws.controller;

import io.sportgift.mapper.CountryMapper;
import io.sportgift.model.Country;
import io.sportgift.service.ICountryService;
import io.sportgift.vo.country.CountrySaveRequestVO;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/country")
@RestController
public class CountryController {

    /*@Qualifier
    private DataSource dataSource;*/

    private final ICountryService countryService;

    public CountryController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @PostMapping
    public Mono<Country> save(@RequestBody CountrySaveRequestVO countrySaveRequestVO) {
        return Mono.justOrEmpty(countryService.save(CountryMapper.countrySaveRequestVOCountry.apply(countrySaveRequestVO)));
    }


    @GetMapping("/{id}")
    public Mono<Map> get(Long id) {
        Map<String, String> userInfo = new HashMap<>();
        userInfo.put("name", "Jose");
        userInfo.put("surname", "Marti Perez");
        return Mono.justOrEmpty(userInfo);
    }
}
