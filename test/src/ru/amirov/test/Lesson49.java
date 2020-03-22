package ru.amirov.test;

/**
 * рекурсия
 */
public class Lesson49 {

    private static int x;

    public static void main(String[] args){
        someMethod();
        counter(3);
        System.out.println(factorial(4));
    }

    private static void someMethod(){
        x++;
        System.out.println("Hello");
        if (x < 4)
            someMethod();
    }

    private static void counter(int n){
        if (n == 0)
            return;

        System.out.println(n);
        counter(n-1);
    }

    private static int factorial(int n){
        if (n == 1)
            return 1;
        return n * factorial(n -1);
    }
}
