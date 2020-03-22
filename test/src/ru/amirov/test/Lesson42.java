package ru.amirov.test;

/**
 * equals and String Pool
 */
public class Lesson42 {
    public static void main(String[] args){
        //сравнение приметивов
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        //сравнение обьектов
        TestObject testObject1 = new TestObject(1);
        TestObject testObject2 = new TestObject(1);
        System.out.println(testObject1.equals(testObject2));

        String str1 = "Hello";
        String str2 = "World";
        String str3 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        //String pool
        //при создавние строки со значением например Hello, вторая такая же строка не создается повторно, а ссылается
        //на первую строку, которая помещена в память
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);

        String a = "hello";
        String b = "hello123".substring(0,5);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}

class TestObject{
    private int id;
    public TestObject(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof TestObject))
            return false;
        TestObject input = (TestObject) o;
        return input.id == this.id;
    }
}
