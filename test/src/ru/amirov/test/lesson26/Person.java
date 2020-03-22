package ru.amirov.test.lesson26;

public class Person implements Info {

    private String name;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo(){
        System.out.println("I am person whit name "+name);
    }

    public void setName(String name){
        this.name = name;
    }

}
