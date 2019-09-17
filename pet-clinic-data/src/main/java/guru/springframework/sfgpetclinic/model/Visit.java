package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Created by uc on 9/17/2019
 */
@Getter
@Setter
public class Visit extends BaseEntity {

    private LocalDate date;
    private String description;
    private Pet pet;
}
