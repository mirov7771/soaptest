package ru.amirov.test.lesson48;

public enum Day {
    MONDAY(0,"Понедельник"),
    THURSDAY(1,"Вторник"),
    WENDSDAY(2,"Среда"),
    TUESDAY(3,"Четверг"),
    FRIDAY(4,"Пятница"),
    SUTTERDAY(5,"Суббота", true),
    SUNDAY(6,"Воскресенье", true);

    private int id;
    private String name;
    private boolean isWeekend;

    Day(int id,String name){
        this.id = id;
        this.name = name;
    }

    Day(int id, String name, boolean isWeekend){
        this.id = id;
        this.name = name;
        this.isWeekend = isWeekend;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean getIsWeekend(){
        return this.isWeekend;
    }

    @Override
    public String toString(){
        String retStr = this.id+" , "+this.name;
        if (Boolean.TRUE.equals(this.isWeekend))
            retStr += " , Выходной";
        return retStr;
    }
}
