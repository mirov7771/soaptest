package ru.amirov.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Exceptions
 */
public class Lesson37 {
    public static void main(String[] args){
        try {
            read1();
        } catch (FileNotFoundException f){
            System.out.println("Error"+f);
        }
        read2();
    }

    //exception добавлен сигнатуре метода
    private static void read1() throws FileNotFoundException {
        File file = new File("test");
        Scanner scanner = new Scanner(file);
        System.out.println("Method test1 ended");
    }

    //exception try/catch
    private static void read2(){
        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Method test2 ended");
    }
}
