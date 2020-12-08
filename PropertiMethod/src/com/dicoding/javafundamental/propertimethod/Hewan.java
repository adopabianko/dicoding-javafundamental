package com.dicoding.javafundamental.propertimethod;

public class Hewan {
    double tinggi = 30;
    double berat = 3;
    int umur;

    Hewan(int umurParam) {
        this.umur = umurParam;
    }

    void lari() {
        System.out.println("Berlari dengan sangat cepat...");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan...");
    }

    void makan() {
        System.out.println("Makan dengan menggunakan mulut...");
    }

    public double getBerat() {
        return berat;
    }

    public double getTinggi() {
        return tinggi;
    }

    public int getUmur() {
        return umur;
    }
}
