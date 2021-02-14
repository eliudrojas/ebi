DROP TABLE IF EXISTS person;

CREATE TABLE person (
    person_id INT AUTO_INCREMENT  PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age numeric(2) not null,
    favourite_colour VARCHAR(25) not null
);
