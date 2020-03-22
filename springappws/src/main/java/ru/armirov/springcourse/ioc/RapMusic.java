package ru.armirov.springcourse.ioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RapMusic {

    private int id;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void playRapSong(){
        System.out.println("Rap song is played");
    }

}
