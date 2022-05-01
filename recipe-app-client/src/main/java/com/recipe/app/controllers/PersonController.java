package com.recipe.app.controllers;

import com.recipe.app.model.PersonDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/persons")
public class PersonController {

    @GetMapping("{personId}")
    public PersonDto getPerson(@PathVariable String personId) {
        log.info("Getting person by id = {}", personId);
        return PersonDto.builder()
                .id(UUID.randomUUID().toString())
                .firstName("Konstantin")
                .lastName("Gromov")
                .build();
    }
}
