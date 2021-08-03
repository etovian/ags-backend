package com.mjg.agsbackend.people;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class PeopleControllerExceptionHandler {

    @ExceptionHandler(value = PersonNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public PersonNotFoundException personNotFoundException(PersonNotFoundException exception) {
        log.error(exception.getMessage());
        return exception;
    }
}
