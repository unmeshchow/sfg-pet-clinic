package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by uc on 9/11/2019
 */
public interface VetService {

    Vet findById(Long id);

    void save(Vet vet);

    Set<Vet> findAll();
}
