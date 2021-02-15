package uk.ac.ebi.test.service;

import uk.ac.ebi.test.dto.PersonDTO;
import org.springframework.stereotype.Service;

@Service
public interface PersonService {

    PersonDTO savePerson(PersonDTO person);

    void deletePerson(PersonDTO person);

    void updatePerson(PersonDTO person);

    PersonDTO getAllPerson();

    PersonDTO getPersonById(Long personId);


}
