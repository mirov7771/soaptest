package ru.armirov.springcourse.ioc;

import org.springframework.stereotype.Component;

@Component("rockMusicTest")
public class RockMusic implements Music{
    @Override
    public String play(){
        return "Rock Music is played";
    }
}
