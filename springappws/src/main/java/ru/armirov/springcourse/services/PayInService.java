package ru.armirov.springcourse.services;

import org.springframework.stereotype.Component;

@Component("PayIn")
public class PayInService implements Service {

    @Override
    public void execute(){
        System.out.println("You are pay in");
    }
}
