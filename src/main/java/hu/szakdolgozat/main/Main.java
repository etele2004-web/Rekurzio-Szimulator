package hu.szakdolgozat.main;

import hu.szakdolgozat.modell.SajatVerem;
import hu.szakdolgozat.nezet.FoAblak;
import hu.szakdolgozat.vezerlo.Vezerlo;

public class Main {
    public static void main(String[] args) {
        SajatVerem verem = new SajatVerem();
        FoAblak ablak = new FoAblak(verem);
        new Vezerlo(verem, ablak);
        ablak.setVisible(true);
    }
}