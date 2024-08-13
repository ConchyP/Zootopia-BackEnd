package org.factzoopia.zootopia.controllers;

import java.util.List;

import org.factzoopia.zootopia.models.Animal;
import org.factzoopia.zootopia.models.enums.AnimalType;
import org.factzoopia.zootopia.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "${api-endpoint}/animals")

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
        Animal animal = animalService.getAnimalById(id);
        if (animal != null) {
            return ResponseEntity.notFound().build();
        }
        return null;
    }

    @PostMapping(path = "/{id}")
    public ResponseEntity<Animal> createAnimal(@RequestBody Animal animal) {
        Animal createdAnimal = animalService.createAnimal(animal);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAnimal);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Animal> uptadeAnimal(@RequestBody Animal animal, @PathVariable Long id) {
        animal.setId(id);
        Animal updateAnimal = animalService.updateAnimal(animal);
        return ResponseEntity.ok(updateAnimal);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteAnimal(@PathVariable Long id) {
        animalService.deleteAnimalById(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/count")
    public ResponseEntity<Long> getAnimalCount() {
        long count = animalService.countAnimals();

        return ResponseEntity.ok(count);
    }

    @GetMapping(path = "/countByType")
    public ResponseEntity<Long> getAnimalCountByType(@RequestParam AnimalType animalType) {
        long count = animalService.countAnimalsByAnimalType(animalType);
        return ResponseEntity.ok(count);
    }

}
