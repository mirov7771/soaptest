package ru.armirov.springcourse.singletonexample;

public class SingletonTest {
    public static void main(String[] args){
        SingletonClass singletonClass1 = SingletonClass.getInstance("Hello");
        SingletonClass singletonClass2 = SingletonClass.getInstance("World");

        System.out.println(singletonClass1 == singletonClass2);
        System.out.println(singletonClass1);
        System.out.println(singletonClass2);

        System.out.println(singletonClass1.getValue()+" "+singletonClass2.getValue());
    }
}
