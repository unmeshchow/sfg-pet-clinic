package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by uc on 9/19/2019
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
