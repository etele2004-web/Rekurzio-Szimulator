package hu.szakdolgozat.modell;

import java.util.Stack;

public class SajatVerem {

    //Java beépített osztályának becsomagolása
    public Stack<VeremKeret> tarolo = new Stack<>();

    public void berak(VeremKeret adat) {
        tarolo.push(adat);
        System.out.println("JELZÉS: Új adat a veremben: " + adat.getSzoveg());
    }

    public void kivesz() {
        if (!tarolo.isEmpty()) {
            VeremKeret adat = tarolo.pop();
            System.out.println("JELZÉS: Adat kivéve: " + adat.getSzoveg());
        } else {
            System.out.println("HIBA: Üres a verem, érvénytelen művelet!");
        }
    }
}