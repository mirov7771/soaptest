package ru.amirov.test.lesson29;

public class Animal {

    String animal;

    private int id;

    public Animal(){

    }

    public Animal(int id){
        this.id = id;
    }

    public void eat(){
        if (animal == null)
            System.out.println("Animal is eating");
        else
            System.out.println(String.format("%s is eating",animal));
    }

    public String toString(){
        return "Animal id is "+this.id;
    }
}
