package com.mjg.agsbackend.people;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping
    public List<Person> getAllPeople() {
        return peopleService.getAllPeople();
    }

    @PostMapping
    public Person postPerson(@RequestBody Person person) {
        return peopleService.addPerson(person);
    }
}
