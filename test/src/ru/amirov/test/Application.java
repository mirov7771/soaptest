package ru.amirov.test;

public class Application {

    public static void main(String[] args){
        System.out.println(Test1.CONSTANT);

        final int x = 10;
        System.out.println(x);
    }
}

class Test1{
    public static final int CONSTANT = 0;
}
