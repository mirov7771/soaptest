package ru.amirov.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * Exceptions
 */
public class Lesson40 {
    public static void main(String[] args){
        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        try{
            run();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException{

    }
}
