package com.company.es4;

public class TestLettoreMultimediale {
    public static void main(String[] args) {

        LettoreMultimediale lettore = new LettoreMultimediale();


        //lo stato iniziale del lettore è stopped
        assert lettore.getStato() == LettoreMultimediale.Stato.STOPPED;

        lettore.play();
        assert lettore.getStato() == LettoreMultimediale.Stato.PLAYING;

        lettore.pause();
        assert lettore.getStato() == LettoreMultimediale.Stato.PAUSED;

        //il volume iniziale è pari al max volume (100) / 2
        int volumeIniziale = lettore.getVolume();
        assert volumeIniziale == LettoreMultimediale.MAX_VOLUME / 2;

        /*//alziamo il volume di uno
        lettore.volumeUp();
        assert lettore.getVolume()== volumeIniziale + 1;

        //alziamo il volume di 2
        lettore.volumeUp(2);
        assert lettore.getVolume() == volumeIniziale + 1 + 2;

        lettore.mute();
        assert lettore.getVolume() == 0;

        Canzone canzone1= new Canzone("Sweet Child O'Mine", "Guns N'Roses");
        Canzone canzone2 = new Canzone("Like a stone", "Audioslave");

        lettore.setCanzoni(new Canzone[]{canzone1, canzone2});*/
    }
}