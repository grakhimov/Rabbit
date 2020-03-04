package controllers;

import domain.Rabbit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.RabbitRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RabbitController {
    @Autowired
    private RabbitRepository rabbitRepository;

    @GetMapping("/rabbits")
    public List<Rabbit> getRabbits() {
        return rabbitRepository.findAll();
    }

    @PostMapping("/rabbits")
    public Rabbit createRabbit(@Valid @RequestBody Rabbit rabbit) {
        return rabbitRepository.save(rabbit);
    }
}
