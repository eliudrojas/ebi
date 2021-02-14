package uk.ac.ebi.test.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import uk.ac.ebi.test.dto.PersonDTO;

@Slf4j
public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
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
        log.info(jsonPersonArray);
        PersonDTO listPerson = objectMapper.readValue(jsonPersonArray, PersonDTO.class);
        log.info("{}",listPerson);
    }
}
