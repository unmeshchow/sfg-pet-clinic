package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by uc on 9/11/2019
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    void save(Owner owner);

    Set<Owner> findAll();
}
