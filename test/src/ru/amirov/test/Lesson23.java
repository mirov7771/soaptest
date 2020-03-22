package ru.amirov.test;

/**
 * String Builder
 */
public class Lesson23 {

    public static void main(String[] args){
        String str1 = "Hello ";
        String str2 = "my ";
        String str3 = "Friend";
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2).append(str3);
        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" my").append(" friend");
        System.out.println(sb2.toString());

        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hello");
        sb3.append(" my");
        sb3.append(" friend");
        System.out.println(sb3.toString());

        System.out.printf("The year is %s, hello %s, String %5d",2020,"Mark",344040939);
        System.out.printf("\nString %10d",100);
        System.out.printf("\nString %10d",1000);
        System.out.printf("\nString %10d",10000);

        System.out.printf("\nString %.2f",100.2234);

    }

}
