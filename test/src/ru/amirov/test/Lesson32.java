package ru.amirov.test;

import ru.amirov.test.lesson29.Animal;
import ru.amirov.test.lesson29.Dog;

/**
 * upcasting, downcasting
 */
public class Lesson32 {
    public static void main(String[] args){
        //upcasting - Восходящее преобразование
        Animal dog = new Dog();
        dog.eat();
            //or
        Dog dog1 = new Dog();
        Animal animal = dog1;
        animal.eat();

        //downcasting - Нисходящее преобразование
        Dog dog2 = (Dog) animal;
        dog2.bark();

        //Моделируем ошибку нисходящего преобразования
        Animal a = new Animal();
        Dog d = (Dog) a;
        d.bark();
    }
}
