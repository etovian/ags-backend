package com.mjg.agsbackend.people;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PersonRepository personRepository;

    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    public Person findById(Long id) {
        return personRepository.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Could not find person with id " + id));
    }

    public List<Person> getAllPeople() {
        return personRepository.findAll();
    }

}
