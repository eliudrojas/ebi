package uk.ac.ebi.test.controller;

import org.springframework.http.ResponseEntity;
import uk.ac.ebi.test.dto.PersonDTO;
import uk.ac.ebi.test.entity.Person;
import uk.ac.ebi.test.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
@Slf4j
public class PersonController {

    @Autowired
    private PersonService personService;


    @PostMapping("/")
    public ResponseEntity<?> savePerson(@RequestBody PersonDTO person) {
        log.info("Inside savePerson of PersonController");
        personService.savePerson(person);
        return ResponseEntity.ok("success");
    }


    @PutMapping("/")
    public ResponseEntity<?>  updatePerson(@RequestBody PersonDTO person) {
        log.info("Inside updatePerson of PersonController");
         personService.savePerson(person);
        return ResponseEntity.ok("success");
    }

    @DeleteMapping("/")
    public  ResponseEntity<?>   deletePerson(@RequestBody PersonDTO person) {
        log.info("Inside deletePerson of PersonController");
        personService.deletePerson(person);
        return ResponseEntity.ok("success");
    }

    @GetMapping("/")
    public ResponseEntity < PersonDTO > list() {
        log.info("Inside list  of PersonController");
        PersonDTO persons = personService.getAllPerson();
        return ResponseEntity.ok(persons);
    }

}
