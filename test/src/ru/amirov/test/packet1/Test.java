package ru.amirov.test.packet1;

public class Test {

    public String getPersonNewName(String value){
        Person person = new Person();
        person.nameNew = value;
        return person.nameNew;
    }

    public String getLatName(){
        Person person = new Person();
        return person.lastName;
    }

}
