package org.lessons.java.exception;

public class Libro {

    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;



    public Libro(String titolo, int numeroPagine, String autore, String editore) throws IllegalArgumentException {
        if (titolo==null || titolo.isEmpty()) {
            throw new IllegalArgumentException("Titolo non puo essere vuoto");
        } else {
            this.titolo = titolo;
        }
        if (numeroPagine <= 0) {
            throw new IllegalArgumentException("Il numero dell pagine non puo essere <= 0");
        } else {
            this.numeroPagine = numeroPagine;
        }
        if (autore==null || autore.isEmpty()) {
            throw new IllegalArgumentException("l'autore non puo essere vuoto");
        } else {
            this.autore = autore;
        }
        if (editore==null || editore.isEmpty()) {
            throw new IllegalArgumentException("l'editore non puo essere vuoto");
        } else {
            this.editore = editore;
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if (titolo==null || titolo.isEmpty()) {
            throw new IllegalArgumentException("Titolo non puo essere vuoto");
        } else {
            this.titolo = titolo;
        }
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        if (numeroPagine <= 0) {
            throw new IllegalArgumentException("Il numero dell pagine non puo essere <= 0");
        } else {
            this.numeroPagine = numeroPagine;
        }
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        if (autore==null || autore.isEmpty()) {
            throw new IllegalArgumentException("l'autore non puo essere vuoto");
        } else {
            this.autore = autore;
        }
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        if (editore==null || editore.isEmpty()) {
            throw new IllegalArgumentException("l'editore non puo essere vuoto");
        } else {
            this.editore = editore;
        }
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", numeroPagine=" + numeroPagine +
                ", autore='" + autore + '\'' +
                ", editore='" + editore + '\'' +
                '}';
    }
}
