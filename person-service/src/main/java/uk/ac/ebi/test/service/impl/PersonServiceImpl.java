package uk.ac.ebi.test.service.impl;


import uk.ac.ebi.test.dto.PersonDTO;
import uk.ac.ebi.test.entity.Person;
import uk.ac.ebi.test.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uk.ac.ebi.test.service.PersonService;

import java.util.List;

@Service
@Slf4j
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonDTO savePerson(PersonDTO person) {
        log.info("savePerson");
        personRepository.saveAll(person.getPerson());
        return person;
    }

    public void deletePerson(PersonDTO person) {
        log.info("deletePerson");
        personRepository.deleteAll(person.getPerson());
    }

    public void updatePerson(PersonDTO person) {
        log.info("updatePerson");
        savePerson(person);
    }

    public PersonDTO getAllPerson(){
        log.info("getAllPerson");
        PersonDTO person = new PersonDTO();
        person.setPerson(personRepository.findAll());
        return person;
    }


}