package ru.amirov.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * save to file
 */
public class Lesson44 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        String path = "test4.txt";
        File file = new File(path);
        boolean isCreated = file.exists();
        System.out.println(file.exists());
        if (Boolean.FALSE.equals(isCreated))
            isCreated = file.createNewFile();
        System.out.println(isCreated);
        if (Boolean.TRUE.equals(isCreated)) {
            System.out.println("------START SAVE TO FILE------");
            PrintWriter pw = new PrintWriter(file);

            pw.println("create test file");
            pw.println("testing");

            pw.close();
            System.out.println("------END SAVE TO FILE------");
        }
    }
}
