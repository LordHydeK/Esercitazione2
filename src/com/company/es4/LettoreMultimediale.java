package com.company.es4;

public class LettoreMultimediale {
    // Attributi
    public enum Stato {STOPPED, PLAYING, PAUSED}
    private Stato statoLettore = Stato.STOPPED;
    public static final int MAX_VOLUME = 100;
    private int volume = MAX_VOLUME / 2;
    private int statoVolumePrecedente = 0;
    public Canzone[] canzoni;

    // Costruttore
    public LettoreMultimediale() {
    }

    // Getter
    public int getVolume() {
        return volume;
    }
    public Stato getStato() {
        return statoLettore;
    }

    // Setter
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setStato(Stato statoLettore) {
        this.statoLettore = statoLettore;
    }

    /**
     * Metodo per cambiare lo stato del lettore a PLAYING
     */
    public void play(){
        this.statoLettore=Stato.PLAYING;
    }

    /**
     * Metodo per cambiare lo stato del lettore a PAUSED
     */
    public void pause(){
        this.statoLettore=Stato.PAUSED;
    }
    /**
     * Metodo per incrementare il volume di una unità
     */
    public void volumeUp() {
        if (this.volume <= MAX_VOLUME-1) {
            this.volume++;
        }
    }
    /**
     * Metodo per incrementare il volume di un valore passato come parametro
     * @param incremento valore
     */
    public void volumeUp(int incremento) {
        if (this.volume <= MAX_VOLUME-incremento) {
            this.volume += incremento;
        }
    }
    /**
     * Metodo per impostare muto
     */
    public void mute() {
        if (this.volume != 0) {
            this.statoVolumePrecedente = this.volume;
            this.volume = 0;
        }
        else if (this.volume == 0 && this.statoVolumePrecedente != 0) {
            this.volume = this.statoVolumePrecedente;
            this.statoVolumePrecedente = 0;
        }
    }

    /**
     * Metodo per impostare una lista di canzoni passata come parametro
     * @param canzoni array di Canzone
     */
    public void setCanzoni(Canzone[] canzoni) {
        this.canzoni = new Canzone[canzoni.length];
        for (int i=0; i<canzoni.length; i++) {
            this.canzoni[i] = canzoni[i];
        }
    }
}
