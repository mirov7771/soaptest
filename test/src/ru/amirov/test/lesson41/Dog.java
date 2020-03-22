package ru.amirov.test.lesson41;

public class Dog extends Animal {
    @Override
    protected void eat(){
        System.out.println("Dog is eating...");
    }

    @Override
    public void makeSound(){
        System.out.println("Bark bark!!!");
    }

    public Dog(){
        super("Dog");
    }
}
