package com.company.es4;

public class LettoreMultimediale {
    // Attributi
    private enum Stato {STOPPED, PLAYING, PAUSED};
    private int volume;
    private static final byte MAX_VOLUME = 100;

    // Costruttore
    public LettoreMultimediale() {
    }

    // Getter
    public int getVolume() {
        return volume;
    }

    // Setter
    public void setVolume(int volume) {
        this.volume = volume;
    }
}
