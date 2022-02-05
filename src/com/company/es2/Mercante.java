package com.company.es2;

public class Mercante extends Lavoratore{
    // Attributi della classe
    private String sedeDelMercato;
    private int numProdottiInVendita;

    // Costruttori
    // 1. Richiama solo gli attributi della superclasse
    public Mercante(String nome, String cognome, double stipendioGiornaliero) {
        super(nome, cognome, stipendioGiornaliero);
    }
    // 2. Richiama gli attributi della superclasse e di classe
    public Mercante(String nome, String cognome, double stipendioGiornaliero, String sedeDelMercato, int numProdottiInVendita) {
        super(nome, cognome, stipendioGiornaliero);
        setSedeDelMercato(sedeDelMercato);
        setNumProdottiInVendita(numProdottiInVendita);
    }

    // Output: "Paolo Neri: guadagna 25.0 nel mercato di San Michele, ha 16 prodotti"
    @Override
    public String toString() {
        return super.toString() + " nel mercato di " + this.getSedeDelMercato() + ", ha " +
                this.getNumProdottiInVendita() + " prodotti";
    }

    // Getter
    public String getSedeDelMercato() {
        return sedeDelMercato;
    }
    public int getNumProdottiInVendita() {
        return numProdottiInVendita;
    }

    // Setter
    public void setSedeDelMercato(String sedeDelMercato) {
        this.sedeDelMercato = sedeDelMercato;
    }
    public void setNumProdottiInVendita(int numProdottiInVendita) {
        this.numProdottiInVendita = numProdottiInVendita;
    }



}