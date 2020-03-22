package ru.amirov.test;

import ru.amirov.test.lesson25.Animal;
import ru.amirov.test.lesson25.Dog;

/**
 * Наследование
 */
public class Lesson25 {

    public static void main(String[] args){
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        System.out.println(animal.name);

        Dog dog = new Dog();
        dog.sleep();
        dog.bark();
        dog.eat();
        dog.showName();
    }

}
