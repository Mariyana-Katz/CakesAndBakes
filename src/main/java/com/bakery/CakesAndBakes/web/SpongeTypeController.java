package com.bakery.CakesAndBakes.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bakery.CakesAndBakes.entity.SpongeType;
import com.bakery.CakesAndBakes.service.SpongeTypeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/spongeType")
@AllArgsConstructor // This annotation is used to generate a constructor with all class fields as
                    // parameters.
// It is useful for dependency injection in Spring, allowing the class to be
// instantiated with its dependencies automatically.
public class SpongeTypeController {

    private final SpongeTypeService spongeTypeService;

    @GetMapping("/{id}")
    public ResponseEntity<SpongeType> getSpongeType(@PathVariable Long id) {
        return new ResponseEntity<>(spongeTypeService.getSpongeTypeById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<SpongeType>> getAllSpongeTypes() {
        return new ResponseEntity<>(spongeTypeService.getAllSpongeTypes(), HttpStatus.OK);
    }

}