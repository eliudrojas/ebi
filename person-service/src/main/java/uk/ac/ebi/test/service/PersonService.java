package uk.ac.ebi.test.service;

import uk.ac.ebi.test.dto.PersonDTO;
import uk.ac.ebi.test.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {

    public PersonDTO savePerson(PersonDTO person);

    public void deletePerson(PersonDTO person);

    public void updatePerson(PersonDTO person);

    public PersonDTO getAllPerson();


}
