package ru.amirov.test.lesson48;

/**
 * Enums
 * согласно конвенции название енума должно быть в единственном числе
 */
public class Lesson48 {

    public static void main(String[] args){
        Animal animal = Animal.CAT;
        switch (animal){
            case CAT:
                System.out.println("CAT");
                break;
            case DOG:
                System.out.println("DOG");
                break;
            case FROG:
                System.out.println("FROG");
                break;
            default:
                System.out.println("Unknown");
        }
        System.out.println(animal.getTranslation());
        System.out.println(animal.toString());

        Season season = Season.AUTUMN;
        switch (season){
            case AUTUMN:
                System.out.println("autumn");
                break;
            case SPRING:
                System.out.println("spring");
                break;
            case SUMMER:
                System.out.println("summer");
                break;
            case WINTER:
                System.out.println("winter");
                break;
        }

        Day day1 = Day.MONDAY;
        Day day2 = Day.SUNDAY;
        System.out.println(day1.toString());
        System.out.println(day2.toString());
        System.out.println(day1.name());

        Animal an = Animal.valueOf("CAT");
        System.out.println(an.toString());

        //возвращает индекс
        System.out.println(season.ordinal());
    }

}
