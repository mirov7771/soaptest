package ru.armirov.springcourse.services;

import org.springframework.stereotype.Component;

@Component("PayOut")
public class PayOutService implements Service {

    @Override
    public void execute(){
        System.out.println("You are pay out");
    }

}
