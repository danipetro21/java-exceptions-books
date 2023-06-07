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

            System.out.print("Inserisci il Titolo del libro: ");
            String titotlo = scan.nextLine();
            System.out.print("Inserisci il numero di pagine del libro: ");
            int nPagine = Integer.parseInt(scan.nextLine());
            System.out.print("Inserisci l'autore del libro: ");
            String autore = scan.nextLine();
            System.out.print("Inserisci l'editore del libro: ");
            String editore = scan.nextLine();

            Libro book = new Libro(titotlo, nPagine, autore, editore);
            listLibri[i] = book;
        }

        for (int i = 0; i < listLibri.length; i++) {

            System.out.println(listLibri[i].toString());
        }

    }

}
