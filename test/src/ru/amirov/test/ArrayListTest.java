package ru.amirov.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args){
        //внутри листа можно указывать только ссылочные типы, примитивы указывать нельзя
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<11;i++){
            list.add(i);
        }
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        int x = 0;
        while (x < 5){
            list2.add(x);
            x++;
        }
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println(list2.toString());

        System.out.println(list.get(0));
        System.out.println(list2.get(list2.size()-1));

        for(Integer i : list2){
            System.out.println(i);
        }

        //for java8 and higher - lamda
        list2.forEach(i -> System.out.println("Number:"+i));

        System.out.println("Old size:"+list.size());
        list.remove(1);
        System.out.println("New size:"+list.size());
    }
}
