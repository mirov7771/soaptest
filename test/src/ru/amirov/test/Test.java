package ru.amirov.test;

public class Test {
    public static void main(String [] args) {
        try {
            badMethod();
            System.out.print("A");
        }
        catch (Exception ex) {
            System.out.print("B");
        }
        finally {
            System.out.print("C");
        }
        System.out.print("D");
        Object
    }

    public static void badMethod() {
        throw new Error();
    }
}
