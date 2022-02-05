package com.company.es2;

public class TestLavoratori {

    public static void main(String[] args) {

        //1: Nome, Cognome, stipendio giornaliero.
        Lavoratore lavoratore = new Lavoratore("Mario", "Rossi", 50.0);

        //2: Nome, Cognome, stipendio giornaliero, sede del mercato, numero prodotti in vendita.
        Mercante mercante = new Mercante("Paolo", "Neri", 25.0, "San Michele", 16);

        assert lavoratore.stipendioSettimanale() == 350.0;
        assert mercante.stipendioSettimanale() == 175.0;


        assert lavoratore.toString().equals("Mario Rossi: guadagna 50.0");
        assert mercante.toString().equals("Paolo Neri: guadagna 25.0 nel mercato di San Michele, ha 16 prodotti");


        // in questo compito:
        // due lavoratori sono uguali se hanno stesso nome, cognome e stipendio giornaliero.
        assert !lavoratore.equals(mercante);

        Lavoratore lavoratore2 = new Lavoratore("Mario", "Rossi", 50.0);
        assert lavoratore.equals(lavoratore2);

        Mercante mercante2 = (Mercante) mercante;
        assert mercante2.merciVendute() == 0;

        mercante2.vendiFragole(3); // vendute 3 fragole
        assert mercante2.merciVendute() == 3;

        mercante2.vendiAsparagi(9);
        mercante2.vendiFragole(2);
        assert mercante2.merciVendute() == 14;

        try {
            mercante2.vendiAsparagi(5);
            assert false;
        } catch(TroppiProdottiVendutiException e) {
            assert true;
        }
    }
}