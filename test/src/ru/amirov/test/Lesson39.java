package ru.amirov.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *Checked Exception (Compile time exception)
 * Unchecked Exception (Runtime exception) - Ошибка в работе программы
 */
public class Lesson39 {
    public static void main(String[] args){
        //Checked
        File file = new File("111");
        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException f){
            System.out.println("Error:"+f);
        }

        //Unchecked
          //ArithmeticException
        int x = 1/0;

        String name = null;
          //NullpointerException
        name.length();

        int[] nums = new int[2];
        //ArrayIndexOutOfBoundsException
        System.out.println(nums[4]);
    }
}
