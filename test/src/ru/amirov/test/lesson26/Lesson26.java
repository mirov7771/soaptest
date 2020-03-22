package ru.amirov.test.lesson26;

/**
 * interfaces
 */
public class Lesson26 {

    public static void main(String[] args){
        Animal animal = new Animal(1);
        Person person = new Person("Mark");
        animal.sleep();
        person.sayHello();

        Info info1 = new Animal(1);
        Info info2 = new Person("Mark");
        info1.showInfo();
        info2.showInfo();

        int[] ids = {1,2,3};
        try {
            for(int id : ids) {
                InfoInstance.INSTANCE.getInfo(id).showInfo();
            }
        } catch (InfoException e){
            //e.printStackTrace();
            System.out.println("Error "+e);
        }

        Animal an = new Animal();
        an.setId(1);
        outputInfo(an);

        Person pr = new Person();
        pr.setName("Mark");
        outputInfo(pr);

        outputInfo(info1);
        outputInfo(info2);
    }

    public static void outputInfo(Info info){
        info.showInfo();
    }

}
