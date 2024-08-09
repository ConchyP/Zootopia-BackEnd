package org.factzoopia.zootopia.controllers;

import org.factzoopia.zootopia.models.Animal;
import org.factzoopia.zootopia.services.AnimalService;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

@RestController
@RequestMapping(path = "${api-endpoint}/animals")
@CrossOrigin(origins = "", allowedHeaders = "*") // Cors en este proyecto no se si va igual. Faltaria la URL

public class AnimalController {

    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Animal>> getAllAnimals() {
        List<Animal> animals = animalService.getAllAnimals();
        return ResponseEntity.ok(animals);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable Long id) {
        Animal animal = animalService.getAnimalsById(id);
        if (animal != null) {
            return ResponseEntity.notFound().build();
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Animal> createAnimal(@AnimalBody Animal animal) {
        Animal createdAnimal = animalService.createAnimals(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAnimal);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Animal> uptadeAnimal(@AnimalBody Animal animal, @PathVariable Long id) {
        animal.setId(id);
        Animal updateAnimal = animalService.updateAnimal(animal);
        return ResponseEntity.ok(updateAnimal);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        animalService.deleteAnimalById(id);

        return ResponseEntity.noContent().build();
    }

}
