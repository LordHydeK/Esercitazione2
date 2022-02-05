package com.company.es2;

public class Mercante extends Lavoratore{
    private String sedeDelMercato;
    private int numProdottiInVendita;

    public Mercante(String nome, String cognome, double stipendioGiornaliero) {
        super(nome, cognome, stipendioGiornaliero);

    }

    public Mercante(String nome, String cognome, double stipendioGiornaliero, String sedeDelMercato, int numProdottiInVendita) {
        super(nome, cognome, stipendioGiornaliero);
        setSedeDelMercato(sedeDelMercato);
        setNumProdottiInVendita(numProdottiInVendita);
    }

    // "Paolo Neri: guadagna 25.0 nel mercato di San Michele, ha 16 prodotti");


    @Override
    public String toString() {
        return super.toString() + " nel mercato di " + this.getSedeDelMercato() + ", ha " +
                this.getNumProdottiInVendita() + " prodotti";
    }

    public String getSedeDelMercato() {
        return sedeDelMercato;
    }

    public void setSedeDelMercato(String sedeDelMercato) {
        this.sedeDelMercato = sedeDelMercato;
    }

    public int getNumProdottiInVendita() {
        return numProdottiInVendita;
    }

    public void setNumProdottiInVendita(int numProdottiInVendita) {
        this.numProdottiInVendita = numProdottiInVendita;
    }
}