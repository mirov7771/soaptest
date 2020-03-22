package ru.amirov.test.lesson26;

public class Animal implements Info {

    private int id;

    public Animal(){

    }

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo(){
        System.out.println("I am animal with id "+id);
    }

    public void setId(int id){
        this.id = id;
    }

}
