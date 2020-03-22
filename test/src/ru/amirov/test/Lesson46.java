package ru.amirov.test;

import java.io.*;
import java.util.Arrays;

/**
 * Сериализация массивов
 */
public class Lesson46 {

    private static final String FILE_NAME = "robots.bin";
    private static final String FILE_NAME_NEW = "robots_new.bin";

    public static void main(String[] args){
        try {
            writeToFile();
            readFromFile();
        } catch (IOException | ClassNotFoundException e){
            System.out.println("Error: "+e);
        }
    }

    private static void writeToFile() throws IOException {
        Robot robot1 = new Robot(1, "T800", "Good",1);
        Robot robot2 = new Robot(2, "T1000", "Bad",2);

        Robot[] robots = {robot1,
                robot2,
                new Robot(3, "T600", "Neutral",3)};

        File file = new File(FILE_NAME);
        boolean fileExists = file.exists();
        if (Boolean.FALSE.equals(fileExists))
            fileExists = file.createNewFile();
        if (Boolean.TRUE.equals(fileExists)){
            //1ый вариант записи в файл
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeInt(robots.length);
            for(Robot robot : robots){
                objectOutputStream.writeObject(robot);
            }
            objectOutputStream.close();

            //2ой вариант записи в файл
            FileOutputStream fos = new FileOutputStream(FILE_NAME_NEW);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(robots);
            oos.close();
        }
    }

    private static void readFromFile() throws IOException, ClassNotFoundException{
        //1ый вариант вычитывания из файла
        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        int x = objectInputStream.readInt();
        Robot[] robots = new Robot[x];
        for(int i=0;i<x;i++){
            robots[i] = (Robot) objectInputStream.readObject();
        }
        for(Robot robot : robots){
            System.out.println(robot.toString());
        }
        System.out.println(Arrays.toString(robots));
        objectInputStream.close();

        //2ой вариант вычитывания из файла
        FileInputStream fis = new FileInputStream(FILE_NAME_NEW);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Robot[] robots1 = (Robot[]) ois.readObject();
        System.out.println(Arrays.toString(robots1));
        ois.close();
    }
}

class Robot implements Serializable {
    private static final long serialVersionUID = -7848258069122233141L;
    private int id;
    private String name;
    //transient - поля которые не сохраняются
    private transient String type;
    private transient int typeId;

    public Robot(int id, String name, String type, int typeId){
        this.id = id;
        this.name = name;
        this.type = type;
        this.typeId = typeId;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getTypeId(){
        return this.typeId;
    }
    @Override
    public String toString(){
        return getId()+" : "+getName()+" : "+getType()+" : "+getTypeId();
    }
}
