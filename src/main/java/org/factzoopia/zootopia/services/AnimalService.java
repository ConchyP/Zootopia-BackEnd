package org.factzoopia.zootopia.services;

import java.util.List;

import org.factzoopia.zootopia.models.Animal;
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

    public Animal getAnimalsById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Animal not found"));
    }

    public Animal createAnimals(Animal animals) {
        return repository.save(animals);
    }

    public Animal updateAnimal(Animal animals) {
        if (!repository.existsById(animals.getId())) {
            throw new RuntimeException("Animal not found");
        }
        return repository.save(animals);
    }

    public void deleteAnimalById(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Animal not found");
        }
        repository.deleteById(id);
    }

}
