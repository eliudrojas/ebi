package uk.ac.ebi.test.repository;

import uk.ac.ebi.test.dto.PersonDTO;
import uk.ac.ebi.test.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findByPersonId(Long personId);
}
