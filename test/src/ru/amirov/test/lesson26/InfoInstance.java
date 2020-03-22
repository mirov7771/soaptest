package ru.amirov.test.lesson26;

public class InfoInstance {

    public static InfoInstance INSTANCE = new InfoInstance();

    public Info getInfo(int id) throws InfoException{
        if (id == 1){
            return new Animal();
        } else if (id == 2){
            return new Person();
        } else {
            throw new InfoException("No implementation for type "+id);
        }
    }

}
