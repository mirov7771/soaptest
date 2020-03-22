package ru.amirov.test.lesson29;

/**
 * Полиморфизми
 */
public class Lesson29 {
    public static void main(String[] args){
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.eat();
        dog.eat();

        Dog dog1 = new Dog();
        dog1.eat();
        dog1.bark();

        test(new Animal());
        test(new Dog());
        test(new Cat());
        test(new Dolphin());
    }

    public static void test(Animal animal){
        animal.eat();
    }


}
