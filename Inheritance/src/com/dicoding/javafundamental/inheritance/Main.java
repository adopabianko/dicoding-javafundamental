package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Hewan(); // memanggil contructor
        System.out.println("Apakah hewan IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan ->" + (hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing ->" + (hewan instanceof Kucing));

        System.out.println("----------------------------------");

        Kucing kucing = new Kucing(); // memanggil contructor
        System.out.println("Apakah hewan IS-A Objek -> " + (kucing instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> " + (kucing instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> " + (kucing instanceof Kucing));

        System.out.println("----------------------------------");

        hewan.makan(); // kucing mewarisi metode makan() dari parent class
        kucing.makan();
        kucing.makan("daging ikan");
    }
}
