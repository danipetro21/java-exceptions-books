package org.lessons.java.exception;

public class Libro {

    private String titolo;
    private int numeroPagine;
    private String autore;
    private String editore;

    public Libro(String titolo, int numeroPagine, String autore, String editore) throws RuntimeException {
        if (titolo.isEmpty()) {
            throw new RuntimeException("Titolo non puo essere vuoto");
        } else {
            this.titolo = titolo;
        }
        if (numeroPagine <= 0) {
            throw new RuntimeException("Il numero dell pagine non puo essere <= 0");
        } else {
            this.numeroPagine = numeroPagine;
        }
        if (autore.isEmpty()) {
            throw new RuntimeException("l'autore non puo essere vuoto");
        } else {
            this.autore = autore;
        }
        if (editore.isEmpty()) {
            throw new RuntimeException("l'editore non puo essere vuoto");
        } else {
            this.editore = editore;
        }
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if (titolo.isEmpty()) {
            throw new RuntimeException("Titolo non puo essere vuoto");
        } else {
            this.titolo = titolo;
        }
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        if (numeroPagine <= 0) {
            throw new RuntimeException("Il numero dell pagine non puo essere <= 0");
        } else {
            this.numeroPagine = numeroPagine;
        }
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        if (autore.isEmpty()) {
            throw new RuntimeException("l'autore non puo essere vuoto");
        } else {
            this.autore = autore;
        }
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        if (editore.isEmpty()) {
            throw new RuntimeException("l'editore non puo essere vuoto");
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
