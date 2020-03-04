package com.rabbits.controllers;

import com.rabbits.domain.Vaccine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.rabbits.repository.VaccineRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
public class VaccineController {
    @Autowired
    private VaccineRepository vaccineRepository;

    @GetMapping("/vaccines")
    public List<Vaccine> getVaccines() {
        return vaccineRepository.findAll();
    }

    @PostMapping("/vaccines")
    public Vaccine createVaccine(@Valid @RequestBody Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }
}
