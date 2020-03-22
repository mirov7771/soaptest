package ru.armirov.springcourse.singletonexample;

/**
 * Паттерн singleton (Одиночка)
 */
public class SingletonClass {

    private static SingletonClass instance;

    private String value;

    private SingletonClass(String value){
        this.value = value;
    }

    public static SingletonClass getInstance(String value){
        if (instance == null)
            instance = new SingletonClass(value);
        return instance;
    }

    public String getValue(){
        return this.value;
    }

}
