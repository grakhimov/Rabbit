package controllers;

import domain.Cage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.CageRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CageController {
    @Autowired
    private CageRepository cageRepository;

    @GetMapping("/cages")
    public List<Cage> getCages() {
        return cageRepository.findAll();
    }

    @PostMapping("/cages")
    public Cage createCage(@Valid @RequestBody Cage cage) {
        return cageRepository.save(cage);
    }
}
