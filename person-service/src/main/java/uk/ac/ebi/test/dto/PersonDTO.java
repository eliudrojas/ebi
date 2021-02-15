package uk.ac.ebi.test.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import uk.ac.ebi.test.entity.Person;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "person"
})
@Data
public class PersonDTO  {
    @JsonProperty("person")
    @NotEmpty(message = "person must not be empty")
    private List<Person> person = null;

    @JsonProperty("person")
    public List<Person> getPerson() {
        return person;
    }

    @JsonProperty("person")
    public void setPerson(List<Person> person) {
        this.person = person;
    }
}
