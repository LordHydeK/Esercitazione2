package com.company.es4;

public class LettoreMultimediale {
    // Attributi
    public enum Stato {STOPPED, PLAYING, PAUSED}
    private Stato statoLettore = Stato.STOPPED;
    public static final int MAX_VOLUME = 100;
    private int volume = MAX_VOLUME / 2;

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

    // metodi
    public void play(){
        this.statoLettore=Stato.PLAYING;
    }

    public void pause(){
        this.statoLettore=Stato.PAUSED;
    }

}
