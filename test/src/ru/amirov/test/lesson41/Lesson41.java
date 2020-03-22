package ru.amirov.test.lesson41;

/**
 * abstract classes
 */
public class Lesson41 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.checkAnimal();

        Cat cat = new Cat();
        cat.checkAnimal();

        dog.eat();
        cat.eat();

        dog.makeSound();
        cat.makeSound();

        dog.create();
        cat.create();
    }
}
