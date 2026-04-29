package hu.szakdolgozat.modell;

public class VeremKeret {
    public String fuggvenyNev;
    public int parameterErtek;
    public int visszateresiSor;

    public VeremKeret(String fuggvenyNev, int parameterErtek, int visszateresiSor) {
        this.fuggvenyNev = fuggvenyNev;
        this.parameterErtek = parameterErtek;
        this.visszateresiSor = visszateresiSor;
    }

    // Segédmetódus a kiíratáshoz
    public String getSzoveg() {
        return fuggvenyNev + "(" + parameterErtek + ") - sor: " + visszateresiSor;
    }
}