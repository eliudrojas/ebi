package uk.ac.ebi.test.exception.response;

import lombok.Data;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "error")
@Data
public class ErrorMessage
{
    public ErrorMessage(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }

    private String message;


    private List<String> details;

}