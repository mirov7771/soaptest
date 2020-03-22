package ru.amirov.test;

import ru.amirov.test.lesson29.Animal;
import ru.amirov.test.lesson29.Cat;
import ru.amirov.test.lesson29.Dog;
import ru.amirov.test.lesson29.Dolphin;

import java.util.ArrayList;
import java.util.List;

/**
 * Generics
 * WildCards
 */
public class Lesson34 {
    public static void main(String[] args){
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));
        test(listOfAnimals);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());
        test(listOfDogs);

        List<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(new Cat());
        test(listOfCats);

        List<Dolphin> listOfDolphins = new ArrayList<>();
        listOfDolphins.add(new Dolphin());
        test(listOfDolphins);

        test2(listOfAnimals);

        test3(listOfAnimals);
    }

    private static void test(List<?> list){
        for(Object animal : list){
            if (animal instanceof Dog){
                Dog item = (Dog) animal;
                item.bark();
            } else if (animal instanceof Cat){
                Cat item = (Cat) animal;
                item.meauw();
            } else if (animal instanceof Animal) {
                Animal item = (Animal) animal;
                item.eat();
            } else {
                System.out.println(animal.toString());
            }
        }
    }

    private static void test2(List<? extends Animal> list){
        for(Animal animal : list){
            animal.eat();
        }
    }

    private static void test3(List<? super Dog> list){
        /*
        в листе только родители класса
        Object
         -Animal
          -Dog
          в данном случае только Object И Animal
         */
        for(Object animal : list){
            System.out.println(animal.toString());
        }

    }
}
