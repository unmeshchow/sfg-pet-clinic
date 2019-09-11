package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by uc on 9/11/2019
 */
public interface PetService {

    Pet findById(Long id);

    void save(Pet pet);

    Set<Pet> findAll();
}
