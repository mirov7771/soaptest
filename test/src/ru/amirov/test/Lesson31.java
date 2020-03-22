package ru.amirov.test;

/**
 * Обертки примитивных типов
 * Double, Float, Long, Integer, Short, Byte, Character, Boolean
 */
public class Lesson31 {

    public static void main(String[] args){
        Integer i = new Integer(1);
        System.out.println(Integer.parseInt("123"));

        //автоупаковка
        Integer i1 = 1;
        //автораспоковка
        Integer i2 = 2;
        int x = i2;


    }

}
