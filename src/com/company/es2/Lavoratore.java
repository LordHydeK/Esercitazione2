package com.company.es2;

import java.util.Objects;

public class Lavoratore {
    // Attributi della classe
    private String nome, cognome;
    private double stipendioGiornaliero;
    private final static int GIORNATE_LAVORATIVE = 7;

    // Costruttore
    public Lavoratore(String nome, String cognome, double stipendioGiornaliero){
        setNome(nome);
        setCognome(cognome);
        setStipendioGiornaliero(stipendioGiornaliero);
    }

    // Output: Mario Rossi: guadagna 50.0
    @Override
    public String toString() {
        return this.nome + " " + this.cognome + ": guadagna " + this.stipendioGiornaliero;
    }

    // Due lavoratori sono uguali se hanno stesso nome, cognome e stipendio giornaliero.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Lavoratore lavoratore = (Lavoratore) o;

        if(this.nome == null || lavoratore.nome == null){
            return false;
        }
        if(this.cognome == null || lavoratore.cognome == null){
            return false;
        }
        if(this.nome == lavoratore.nome && this.cognome == lavoratore.cognome &&
                this.stipendioGiornaliero == lavoratore.stipendioGiornaliero){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, stipendioGiornaliero);
    }

    /**
     * Metodo per calcolare lo stipendio settimanale
     * @return Valore dello stipendio settimanale
     */
    public double stipendioSettimanale(){
        return getStipendioGiornaliero()*GIORNATE_LAVORATIVE;
    }

    // Getter
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public double getStipendioGiornaliero() {
        return stipendioGiornaliero;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setStipendioGiornaliero(double stipendioGiornaliero) {
        this.stipendioGiornaliero = stipendioGiornaliero;
    }



}