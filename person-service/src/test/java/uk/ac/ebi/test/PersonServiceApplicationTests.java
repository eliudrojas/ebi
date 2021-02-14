package uk.ac.ebi.test;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import uk.ac.ebi.test.controller.PersonController;
import uk.ac.ebi.test.dto.PersonDTO;
import uk.ac.ebi.test.entity.Person;
import uk.ac.ebi.test.service.PersonService;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PersonController.class)
class PersonServiceApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private PersonService personService;

	@Test
	void savePerson() {
		List<Person> person = new ArrayList<Person>();
		Person element1 = new Person();
		element1.setFirstName("Eliud");
		element1.setLastName("Rojas");
		element1.setAge(10);
		element1.setFavouriteColour("Red");

		Person element2 = new Person();
		element2.setFirstName("Eliud");
		element2.setLastName("Gonzalez");
		element2.setAge(17);
		element2.setFavouriteColour("Red");


		PersonDTO personDTO = new PersonDTO();
		person.add(element1);
		person.add(element2);

		when(personService.savePerson(personDTO)).thenReturn(personDTO);
	}

	@Test
	void getPerson() throws Exception {
		String jsonPersonArray =
				"{" +
						"\"person\": [" +
						"{" +
						"\"firstName\": \"John\"," +
						"\"lastName\": \"Keynes\"," +
						"\"age\": \"29\"," +
						"\"favouriteColour\": \"red\"" +
						"}," +
						"{" +
						"\"firstName\": \"Sarah\"," +
						"\"lastName\": \"Robinson\"," +
						"\"age\": \"54\"," +
						"\"favouriteColour\": \"blue\"" +
						"}" +
						"]" +
						"}";

		mockMvc
				.perform(MockMvcRequestBuilders.get("/api/v1/person/"))
				.andExpect(status().isUnauthorized());

	}
}
