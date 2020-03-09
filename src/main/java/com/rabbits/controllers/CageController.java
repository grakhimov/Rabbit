package com.rabbits.controllers;

import com.rabbits.domain.Cage;
import com.rabbits.exceptions.CageBadRequestException;
import com.rabbits.repository.CageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
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

    /*@PutMapping("/cages/{cageId}")
    public ResponseEntity<Cage> updateCage(@PathVariable long cageId, @Valid @RequestBody Cage cage) {
        Cage c = cageRepository.findById(cageId).orElseThrow(() ->
                new CageBadRequestException(cageId));
        c.setEntity(cage.getEntity());
        c.setPos_x(cage.getPos_x());
        c.setPos_y(cage.getPos_y());
        final Cage updatedCage = cageRepository.save(c);
        return ResponseEntity.ok(updatedCage);
    }*/

    @PutMapping("/cages/{cageId}")
    public ResponseEntity<Cage> updateCagePosition(@PathVariable long cageId, @RequestBody HashMap<String, Integer> body) {
        Cage c = cageRepository.findById(cageId).orElseThrow(() ->
                new CageBadRequestException(cageId));
        c.setPos_x(body.get("pos_x"));
        c.setPos_y(body.get("pos_y"));
        c.setEntity(body.get("entity"));
        final Cage updatedCage = cageRepository.save(c);
        return ResponseEntity.ok(updatedCage);
    }

    @DeleteMapping("/cages/{cageId}")
    public ResponseEntity deleteCage(@PathVariable long cageId) {
        Cage c = cageRepository.findById(cageId).orElseThrow(() ->
                new CageBadRequestException(cageId));
        cageRepository.delete(c);
        return ResponseEntity.noContent().build();
    }
}
