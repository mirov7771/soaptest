package ru.amirov.test;

import ru.amirov.test.packet1.Person;
import ru.amirov.test.packet1.Test;

/**
 * Модификаторы доступа
 * public -- доступно в любом из классов
 * private -- доступно только в классе
 * default -- доступно в пределах пакета (модификатор default не указывается, например class Test, void test)
 * protected -- доступно в пределах одного пакета, доступно всем подкласса вне пакета
 */

public class Lesson28 {

    public static int id;

    public static void main(String[] args){
        Person person = new Person();
        person.name = "Test";
        System.out.println(person.name);
        System.out.println(new Test().getPersonNewName("Test2"));
        technicalMethod();
        System.out.println(Person.CONSTANT);
        person.setOldName("Test_OLD");
        System.out.println(person.getOldName());

        System.out.println(new Test().getLatName());

        //new ru.amirov.test.Test().showLatName();
    }

    private static void technicalMethod(){
        id = 1;
        System.out.println(id);
    }

}
