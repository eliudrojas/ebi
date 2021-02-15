package uk.ac.ebi.test.service.impl;


import uk.ac.ebi.test.dto.PersonDTO;
import uk.ac.ebi.test.entity.Person;
import uk.ac.ebi.test.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import uk.ac.ebi.test.service.PersonService;

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

    public Integer deletePerson(PersonDTO person) {
        log.info("deletePerson");
        Integer count = 0;
        for (Person p: person.getPerson()) {
            if (personRepository.findById(p.getPersonId()) != null) {
                personRepository.deleteById(p.getPersonId());
                count++;
            }
        }
        return count;
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

    public PersonDTO getPersonById(Long personId) {
        log.info("getAllPerson");
        PersonDTO person = new PersonDTO();
        person.setPerson(personRepository.findByPersonId(personId));
        return person;
    }

}