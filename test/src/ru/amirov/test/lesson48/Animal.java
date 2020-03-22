package ru.amirov.test.lesson48;

public enum Animal {
    DOG("Собака"),
    CAT("Кошка"),
    FROG("Лягушка");

    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation(){
        return this.translation;
    }

    @Override
    public String toString(){
        return super.toString()+" : "+this.translation;
    }
}
