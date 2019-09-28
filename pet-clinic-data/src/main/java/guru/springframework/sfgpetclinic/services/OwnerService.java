package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by uc on 9/11/2019
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);Set<Owner> findAllByLastNameLike(String lastName);


}
