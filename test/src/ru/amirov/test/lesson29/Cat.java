package ru.amirov.test.lesson29;

public class Cat extends Animal {

    public void eat(){
        animal = "Cat";
        super.eat();
    }

    public void meauw(){
        System.out.println("Meeeaaw!!!");
    }

}
