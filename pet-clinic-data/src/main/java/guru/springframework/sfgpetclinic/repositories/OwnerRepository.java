package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by uc on 9/19/2019
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
