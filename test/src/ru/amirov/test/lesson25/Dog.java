package ru.amirov.test.lesson25;

public class Dog extends Animal {

    public void bark(){
        System.out.println("I am barking");
    }

    @Override
    public void eat(){
        System.out.println("I am dog and I am eating");
    }

    public void showName(){
        super.name = "Dog";
        System.out.println(name);
    }

}
