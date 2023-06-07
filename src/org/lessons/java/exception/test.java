package org.lessons.java.exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {

    public static void main(String[] args) {

        try {
            File file = new File("html.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Questo è il testo da scrivere nel file.");
            bufferedWriter.close();
            System.out.println("Scrittura completata.");
        } catch (IOException e) {
            System.out.println("Si è verificato un errore durante la scrittura del file.");
            e.printStackTrace();
        }
    }
}
