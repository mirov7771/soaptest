package ru.amirov.test;

/**
 * примитивные типы
 */
public class Lesson30 {

    public static void main(String[] args){
        int x = 1111111111;
        short y = 22333;
        byte c = 127; //-128 to 127
        long e = 121212121;
        double g = 12.12;
        float f = 121.12f;
        float cc = (float) 123.2;
        float tt = 123.2F;
        long ll = 1212121L;
        int xx = (int) ll; //явное приведение
        long xxx = x; //неявное приведение

        double pp = 123.5;
        int ppp = (int) pp;
        System.out.println(ppp);

        System.out.println(Math.round(pp));

        byte ii = (byte) 131;
        System.out.println(ii);
    }

}
