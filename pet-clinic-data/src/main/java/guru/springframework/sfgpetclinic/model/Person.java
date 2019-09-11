package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by uc on 9/11/2019
 */
@Getter
@Setter
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
}
