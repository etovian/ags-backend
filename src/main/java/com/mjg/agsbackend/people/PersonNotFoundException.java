package com.mjg.agsbackend.people;

public class PersonNotFoundException extends RuntimeException {

    PersonNotFoundException(String message) {
        super(message);
    }
}
