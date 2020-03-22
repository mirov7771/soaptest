package ru.armirov.springcourse.ioc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component("classicalMusicTest")
@Scope("singleton")
public class ClassicalMusic implements Music{

    private int id;

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void destroyMyInit(){
        System.out.println("Finish my initialization");
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public String play(){
        return "Classical Music is played";
    }
}
