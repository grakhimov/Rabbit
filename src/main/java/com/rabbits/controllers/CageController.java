package com.rabbits.controllers;

import com.rabbits.domain.Cage;
import com.rabbits.exceptions.CageNotFoundException;
import com.rabbits.repository.CageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CageController {
    @Autowired
    private CageRepository cageRepository;

    @GetMapping("/cages")
    public ResponseEntity<List<Cage>> getCages() {
        return ResponseEntity.ok(cageRepository.findAll());
    }

    @PostMapping("/cages")
    public ResponseEntity<Cage> createCage(@Valid @RequestBody Cage cage) {
        cageRepository.save(cage);
        return ResponseEntity.ok(cage);
    }

    @PutMapping("/cages/{cageId}")
    public ResponseEntity<Cage> updateCage(@PathVariable long cageId, @Valid @RequestBody Cage cage) {
        Cage c = cageRepository.findById(cageId).orElseThrow(() ->
                new CageNotFoundException(cageId));
        c.setEntity(cage.getEntity());
        c.setPos_x(cage.getPos_x());
        c.setPos_y(cage.getPos_y());
        final Cage updatedCage = cageRepository.save(c);
        return ResponseEntity.ok(updatedCage);
    }
}
