package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope
public class Clock {

    public LocalTime getTime() {
        return LocalTime.now();
    }

}
