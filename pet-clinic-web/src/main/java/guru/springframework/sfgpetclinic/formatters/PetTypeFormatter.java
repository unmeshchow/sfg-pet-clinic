package guru.springframework.sfgpetclinic.formatters;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * Created by uc on 9/30/2019
 */
@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeRepository petTypeRepository;

    public PetTypeFormatter(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public PetType parse(String name, Locale locale) throws ParseException {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        for (PetType petType: petTypes) {
            if (petType.getName().equals(name)) {
                return petType;
            }
        }
        throw new ParseException("type not found: " + name, 0);
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }
}
