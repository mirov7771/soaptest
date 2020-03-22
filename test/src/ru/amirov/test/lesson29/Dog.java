package ru.amirov.test.lesson29;

public class Dog extends Animal {

    @Override
    public void eat(){
        animal = "Dog";
        super.eat();
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
