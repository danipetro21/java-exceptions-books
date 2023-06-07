package org.lessons.java.exception;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*  Libro book = new Libro("Hello world!!", 150, "Daniele", "Mondadori");*/

        System.out.print("Quanti libri vuoi inserire: ");
        int n = Integer.parseInt(scan.nextLine());

        Libro[] listLibri = new Libro[n];

        for (int i = 0; i < listLibri.length; i++) {


            String titotlo = null;
            int nPagine = 0;
            String autore = null;
            String editore = null;
            boolean validBook = false;
            Libro book = null;
            do {
                try {
                    System.out.print("Inserisci il Titolo del libro: ");
                    titotlo = scan.nextLine();
                    System.out.print("Inserisci il numero di pagine del libro: ");
                    nPagine = Integer.parseInt(scan.nextLine());
                    System.out.print("Inserisci l'autore del libro: ");
                    autore = scan.nextLine();
                    System.out.print("Inserisci l'editore del libro: ");
                    editore = scan.nextLine();

                    book = new Libro(titotlo, nPagine, autore, editore);
                    validBook = true;

                } catch (RuntimeException e) {
                    System.out.println("Inserisci dei dati validi");
                }
            } while (!validBook);

            listLibri[i] = book;
        }

        for (int i = 0; i < listLibri.length; i++) {

            System.out.println(listLibri[i].toString());
        }

    }

}
