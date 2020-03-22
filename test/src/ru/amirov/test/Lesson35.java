package ru.amirov.test;

/**
 * Анонимные классы
 */
interface AnimalInt{
    void eat();
}

class Animal {
    public void eat(){
        System.out.println("Animal is eating....");
    }
}

public class Lesson35 {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        animal1.eat();

        Animal animal = new Animal() {
            @Override
            public void eat(){
                System.out.println("Other animal is eating...");
            }
        };
        animal.eat();

        AnimalInt animalInt = new AnimalInt() {
            @Override
            public void eat() {
                System.out.println("New Animal is eating....");
            }
        };

        animalInt.eat();

        AnimalInt animalInt2 = () -> System.out.println("New new Animal is eating....");

        animalInt2.eat();

    }
}
