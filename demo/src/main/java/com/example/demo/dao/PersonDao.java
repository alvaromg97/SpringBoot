package com.example.demo.dao;

import com.example.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao { // introduce una persona con id
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) { // introduce a una persona sin id y el id se genera random
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID uuid, Person person);

}
