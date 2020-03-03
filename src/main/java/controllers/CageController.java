package controllers;

import domain.Cage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.CageRepository;

import javax.validation.Valid;

@RestController
public class CageController {
    @Autowired
    private CageRepository cageRepository;

    @GetMapping("/cages")
    public Page<Cage> getCages(Pageable pageable) {
        return cageRepository.findAll(pageable);
    }

    @PostMapping("/cages")
    public Cage createCage(@Valid @RequestBody Cage cage) {
        return cageRepository.save(cage);
    }
}
