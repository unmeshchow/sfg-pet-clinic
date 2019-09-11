package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by uc on 9/11/2019
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    private Long id;
}
