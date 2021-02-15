package uk.ac.ebi.test.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import uk.ac.ebi.test.dto.PersonDTO;
import uk.ac.ebi.test.exception.RecordNotFoundException;
import uk.ac.ebi.test.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/person")
@Slf4j
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping("/")
    public ResponseEntity<PersonDTO> savePerson(@RequestBody
                                                    @NotNull(message = "Person list cannot be null.")
                                                    @NotEmpty(message = "Person list cannot be empty.")
                                                    @Valid PersonDTO person) {
        log.info("Inside savePerson of PersonController");
        if (person.getPerson().isEmpty()) {
            throw new RecordNotFoundException("Person list is empty");
        }
        personService.savePerson(person);
        return new ResponseEntity(person, HttpStatus.OK);
    }


    @PutMapping("/")
    public ResponseEntity<?>  updatePerson(@Valid @RequestBody PersonDTO person) {
        log.info("Inside updatePerson of PersonController");
        if (person.getPerson().isEmpty()) {
            throw new RecordNotFoundException("Person list is empty");
        }
        personService.savePerson(person);
        return ResponseEntity.ok("success");
    }

    @DeleteMapping("/")
    public  ResponseEntity<?>   deletePerson(@Valid @RequestBody PersonDTO person) {
        log.info("Inside deletePerson of PersonController");
        if (person.getPerson().isEmpty()) {
            throw new RecordNotFoundException("Person list is empty");
        }
        personService.deletePerson(person);
        return ResponseEntity.ok("success");
    }

    @GetMapping("/")
    public ResponseEntity < PersonDTO > list() {
        log.info("Inside list  of PersonController");
        PersonDTO person = personService.getAllPerson();
        if (person.getPerson().isEmpty()) {
            throw new RecordNotFoundException("Person list is empty");
        }
        return ResponseEntity.ok(person);
    }

    @GetMapping("/{personId}")
    public ResponseEntity < PersonDTO > getPersonById(@PathVariable("personId") Long personId) {
        log.info("Inside getPersonById  PersonController");
        PersonDTO person = personService.getPersonById(personId);
        if (person.getPerson().isEmpty()) {
            throw new RecordNotFoundException("Invalid person id : " + personId);
        }
        return ResponseEntity.ok(person);
    }
}
