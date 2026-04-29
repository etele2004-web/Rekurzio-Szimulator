package hu.szakdolgozat.vezerlo;

import hu.szakdolgozat.modell.*;
import hu.szakdolgozat.nezet.FoAblak;
import javax.swing.Timer;

public class Vezerlo {
    int szam = 5;
    boolean lefeleKezdunk = true;

    public Vezerlo(SajatVerem verem, FoAblak ablak) {
        // 1. LÉPÉS GOMB
        ablak.lepesGomb.addActionListener(e -> {
            egyetLep(verem, ablak);
        });
        // 2. INDÍTÁS GOMB
        ablak.inditasGomb.addActionListener(e -> {
            Timer idozito = new Timer(1000, esemeny -> egyetLep(verem, ablak));
            idozito.start();
        });
        // 3. ÚJRA GOMB
        ablak.ujraGomb.addActionListener(e -> {
            verem.tarolo.clear();
            szam = 5;
            lefeleKezdunk = true;
            ablak.repaint();
        });
    }
    private void egyetLep(SajatVerem verem, FoAblak ablak) {
        if (lefeleKezdunk) {
            verem.berak(new VeremKeret("faktorialis", szam, 6));
            if (szam > 1) {
                szam--;
            } else {
                lefeleKezdunk = false; // Elértük az 1-et, fordulunk!
            }
        } else {
            verem.kivesz(); // Visszafelé bontjuk a vermet
        }
        ablak.repaint();
    }
}