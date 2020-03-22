package ru.amirov.test;

import java.io.*;

/**
 * Сериализация - сохранение объектов во внешних файлах
 * Десериализация - получение обьектов из внешних файлов
 */
public class Lesson45 {

    private static final String FILE_NAME = "persons.bin";

    public static void main(String[] args){
        try {
            writeObject();
            readObject();
        } catch (IOException e){
            System.out.println("Error: "+e);
        }
    }

    public static void writeObject() throws IOException {
        Person person1 = new Person(1, "Mark");
        Person person2 = new Person(2, "Roman");

        File file = new File(FILE_NAME);
        boolean fileExists = file.exists();
        if (Boolean.FALSE.equals(fileExists))
            fileExists = file.createNewFile();
        if (Boolean.TRUE.equals(fileExists)) {
            FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);
            objectOutputStream.close();
        }
    }

    public static void readObject(){
        //try with resources example
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();
            System.out.println(person1.toString());
            System.out.println(person2.toString());
        } catch (IOException | ClassNotFoundException e){
            System.out.println("error: "+e);
        }
    }
}

class Person implements Serializable{
    private static final long serialVersionUID = -55832370968955342L;
    private int id;
    private String name;
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return id+" : "+name;
    }
}
