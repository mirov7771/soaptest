package ru.amirov.test;

import ru.amirov.test.lesson27.Forest.Something.SomClass;

/**
 * inner classes
 */
public class Lesson43 {
    public static void main(String[] args){
        new Electrocar(1).start();
        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
    }
}

class Electrocar{

    private int id;

    public Electrocar(int id){
        this.id = id;
    }

    //inner non-static class
    private class Motor {
        public void startMotor(){
            System.out.println("Motor "+id+" is starting");
        }
    }

    //inner static class
    public static class Battery {
        public void charge(){
            System.out.println("Battery is charging");
        }
    }

    public void start(){
        new Motor().startMotor();
        System.out.println(String.format("Electrocar %s is starting",id));

        final int x = 0;
        //inner class in method
        class SomeClass{
            private int id2;

            public SomeClass(){

            }

            public SomeClass(int id2){
                this.id2 = id2;
            }

            public int getId2(){
                return this.id2;
            }

            public void setId2(int id2){
                this.id2 = id2;
            }

            public void someMethod(){
                System.out.println("Some method constant "+x+" of id "+id);
            }
        }

        SomeClass someClass = new SomeClass();
        someClass.setId2(this.id);
        System.out.println(someClass.getId2());
        someClass.someMethod();
    }
}
