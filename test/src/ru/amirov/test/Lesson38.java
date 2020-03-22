package ru.amirov.test;

import java.io.IOException;
import java.util.Scanner;

/**
 * trhow exception
 */
public class Lesson38 {
    public static void main(String[] args) throws IOException, ScannerException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int i = Integer.parseInt(scanner.nextLine());
            if (i == 0)
                throw new IOException("Wrong number");

            if (i == 1)
                try{
                    throw new IOException();
                } catch (IOException e){
                    System.out.println("Число один");
                }
            checkNumber(i);
        }
    }

    public static void checkNumber(int i) throws ScannerException {
        if (i == 2)
            throw new ScannerException();
    }
}
