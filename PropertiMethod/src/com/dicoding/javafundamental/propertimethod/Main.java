package com.dicoding.javafundamental.propertimethod;

public class Main {
    public static void main(String[] args) {
        Hewan kucing=  new Hewan(2);

        kucing.makan();
        kucing.jalan();
        kucing.lari();

        System.out.println("Umurnya adalah " + kucing.getUmur());

        double bmi = kucing.getBerat() / ((kucing.getTinggi() * 0.01) * (kucing.getTinggi() * 0.01));
        System.out.println("Indeks masa tubuhnya adalah " + bmi);
    }
}
