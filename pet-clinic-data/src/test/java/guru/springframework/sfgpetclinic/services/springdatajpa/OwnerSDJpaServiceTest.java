package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    @Mock
    private OwnerRepository ownerRepository;

    @InjectMocks
    private OwnerSDJpaService ownerSDJpaService;

    private final String LAST_NAME = "Smith";
    private Owner owner;

    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(1L).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(anyString())).thenReturn(owner);

        Owner foundOwner = ownerSDJpaService.findByLastName(LAST_NAME);

        assertNotNull(foundOwner);
        verify(ownerRepository).findByLastName(LAST_NAME);
    }

    @Test
    void findByLastNameNotFound() {
        final String emptyStr = "";
        when(ownerRepository.findByLastName(anyString())).thenReturn(null);

        Owner foundOwner = ownerSDJpaService.findByLastName(emptyStr);

        assertNull(foundOwner);
        verify(ownerRepository).findByLastName(emptyStr);
    }

    @Test
    void findAll() {
        Iterable<Owner> owners = new HashSet<>();
        ((HashSet<Owner>) owners).add(Owner.builder().id(1L).build());
        ((HashSet<Owner>) owners).add(Owner.builder().id(2L).build());

        when(ownerRepository.findAll()).thenReturn(owners);

        Set<Owner> foundOwners = ownerSDJpaService.findAll();

        assertNotNull(foundOwners);
        assertEquals(2, foundOwners.size());
        verify(ownerRepository).findAll();
    }

    @Test
    void findById() {
        Long ownerId = 1L;

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(owner));

        Owner foundOwner = ownerSDJpaService.findById(ownerId);

        assertNotNull(foundOwner);
        assertEquals(ownerId, foundOwner.getId());
        verify(ownerRepository).findById(ownerId);
    }

    @Test
    void findByIdNotFound() {
        Long ownerId = 2L;

        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner foundOwner = ownerSDJpaService.findById(ownerId);

        assertNull(foundOwner);
        verify(ownerRepository).findById(ownerId);
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().build();

        when(ownerRepository.save(any(Owner.class))).thenReturn(owner);

        Owner savedOwner = ownerSDJpaService.save(ownerToSave);

        assertNotNull(savedOwner);
        assertEquals(new Long(1L), savedOwner.getId());
        verify(ownerRepository).save(ownerToSave);
    }

    @Test
    void delete() {
        ownerSDJpaService.delete(owner);

        verify(ownerRepository).delete(owner);
    }

    @Test
    void deleteById() {
        Long ownerId = 1L;

        ownerSDJpaService.deleteById(ownerId);

        verify(ownerRepository).deleteById(ownerId);
    }
}