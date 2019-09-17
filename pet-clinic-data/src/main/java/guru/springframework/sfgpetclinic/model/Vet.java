package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by uc on 9/11/2019
 */
@Getter
@Setter
public class Vet extends Person {

    private Set<Specialty> specialties;
}
