package com.company.es4;

public class Canzone {
    // attributi
    private String titolo;
    private String cantante;

    // costruttore
    public Canzone(String titolo, String cantante) {
        this.titolo = titolo;
        this.cantante = cantante;
    }

    // getter
    public String getTitolo() {
        return titolo;
    }
    public String getCantante() {
        return cantante;
    }

    // setter
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
}


