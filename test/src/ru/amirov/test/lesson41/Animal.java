package ru.amirov.test.lesson41;

import java.util.Date;

/**
 * обьекты абстрактного класса нельзя создавать
 */
public abstract class Animal implements Creatures {
    private String name;
    protected abstract void eat();
    public abstract void makeSound();
    public Animal(String name){
        this.name = name;
    }
    public void checkAnimal(){
        System.out.println(String.format("Animal %s is created",name));
    }

    @Override
    public void create(){
        System.out.println("Animal is created at "+new Date());
    }
}
