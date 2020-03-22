package ru.amirov.test.lesson41;

public class Cat extends Animal {
    @Override
    protected void eat(){
        System.out.println("Cat is eating...");
    }

    @Override
    public void makeSound(){
        System.out.println("Meeaaauwww!!!");
    }

    public Cat(){
        super("Cat");
    }
}
