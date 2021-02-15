package uk.ac.ebi.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long personId;
    @Column(length = 50, nullable = false)
    @NotEmpty(message = "first name must not be empty")
    private String firstName;
    @Column(length = 50, nullable = false)
    @NotEmpty(message = "last name must not be empty")
    private String lastName;
    @Column(nullable = false,precision = 2)
    @NotEmpty(message = "age must not be empty")
    private Integer age;
    @Column(length = 25, nullable = false)
    @NotEmpty(message = "Favourite Colour must not be empty")
    private String favouriteColour;
}
