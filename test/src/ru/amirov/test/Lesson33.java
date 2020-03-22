package ru.amirov.test;

import java.util.ArrayList;
import java.util.List;

public class Lesson33 {
    public static void main(String[] args){
        ////До JAVA 5
        List animals = new ArrayList();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Frog");
        for(int i=0;i<animals.size();i++){
            String animal = (String) animals.get(i);
            System.out.println(animal);
        }

        ////параметризация
        List<String> list = new ArrayList<>();
        list.add("Dog");
        list.add("Cat");
        list.add("Frog");

        for(String i : list) {
            String animal = i;
            System.out.println(animal);
        }
    }
}
