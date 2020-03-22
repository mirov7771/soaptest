package ru.amirov.test.packet1;

public class Person {

    public String name;
    String nameNew;
    public static final String CONSTANT = "CONSTANT";
    private String oldName;
    protected String lastName;

    public Person(){
        lastName = "Protected";
    }

    public String getOldName(){
        return this.oldName;
    }

    public void setOldName(String value){
        this.oldName = value;
    }

}
