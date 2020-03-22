package ru.armirov.springcourse.factory;

/**
 * Паттерн фабричный метод
 */
public class TestFactory {

    private TestFactory(){

    }

    public static TestFactory getTestFactory(){
        return new TestFactory();
    }

    public void execute(){
        System.out.println("Test factory created");
    }


}
