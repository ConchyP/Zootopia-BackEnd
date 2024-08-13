package org.factzoopia.zootopia.services;

import java.util.List;

import org.factzoopia.zootopia.exceptions.AnimalsNotFoundException;
import org.factzoopia.zootopia.models.Animal;
import org.factzoopia.zootopia.models.enums.AnimalType;
import org.factzoopia.zootopia.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public List<Animal> getAllAnimals() {
        return repository.findAll();
    }

    public Animal getAnimalById(Long id) {
        return repository.findById(id).orElseThrow(() -> new AnimalsNotFoundException("Animal not found"));
    }

    public Animal createAnimal(Animal animal) {
        return repository.save(animal);
    }

    public Animal updateAnimal(Animal animal) {
        if (!repository.existsById(animal.getId())) {
            throw new AnimalsNotFoundException("Animal not found");
        }
        return repository.save(animal);
    }

    public void deleteAnimalById(Long id) {
        if (!repository.existsById(id)) {
            throw new AnimalsNotFoundException("Animal not found");
        }
        repository.deleteById(id);
    }
    
    public long countAnimals() {
        return repository.count();
    }

    public long countAnimalsByAnimalType(AnimalType animalType) {
        return repository.countByAnimalType(animalType);
    }

}
