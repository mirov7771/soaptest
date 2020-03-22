package ru.amirov.test;

import ru.amirov.test.lesson27.Forest.*;
import ru.amirov.test.lesson27.Forest.Something.SomClass;

import java.util.Scanner;

/**
 * packages
 */
public class Lesson27 {

    public static void main(String[] args){
        Tree tree1 = new Tree();
        Squirel squirel = new Squirel();
        SomClass somClass = new SomClass();
        System.out.println(tree1.getClass().getName());
        System.out.println(squirel.getClass().getName());
        System.out.println(somClass.getClass().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
    }

}
