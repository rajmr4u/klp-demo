package com.rajesh.klp.demo.controller;

import com.rajesh.klp.demo.service.CountyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/county")
public class CountyController {

    private final CountyService countyService;

    public CountyController(CountyService countyService) {
        this.countyService = countyService;
    }

    @GetMapping("/{countyNumber}")
    public ResponseEntity<String> getCountyName(@PathVariable String countyNumber) {
        String countyName = countyService.getCountyName(countyNumber);
        return ResponseEntity.ok().body(countyName);
    }
}
