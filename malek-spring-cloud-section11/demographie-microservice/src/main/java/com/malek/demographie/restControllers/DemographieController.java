package com.malek.demographie.restControllers;

import com.malek.demographie.config.Configuration;
import com.malek.demographie.dto.DemographieDto;
import com.malek.demographie.service.DemographieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/demographies")
//@AllArgsConstructor
public class DemographieController {


    @Value("${build.version}")
    private String buildVersion;

    @Autowired
    Configuration configuration;

    private DemographieService demographieService;

    public DemographieController(DemographieService demographieService){
        this.demographieService = demographieService;
    }

//    @GetMapping("{code}")
    @GetMapping("{code}")
    public ResponseEntity<DemographieDto> getDemoByCode(@PathVariable("code") String code) {
        return new ResponseEntity<DemographieDto>(
                demographieService.getDemographieByCode(code),
                HttpStatus.OK
        );
    }

    @GetMapping("/version")
    public ResponseEntity<String> version() {
        return ResponseEntity.ok(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}
