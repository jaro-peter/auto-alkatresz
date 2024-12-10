package hu.jaro.modells;

public class Termek {

    private String nev;

    private int azonosito;

    private double ar;

    private int keszlet;

    public Termek(String nev, int azonosito, double ar, int keszlet) {
        this.nev = nev;
        this.azonosito = azonosito;
        this.ar = ar;
        this.keszlet = keszlet;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(int azonosito) {
        this.azonosito = azonosito;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public int getKeszlet() {
        return keszlet;
    }

    public void setKeszlet(int keszlet) {
        this.keszlet = keszlet;
    }


}
