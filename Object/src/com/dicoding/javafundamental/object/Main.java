package com.dicoding.javafundamental.object;

public class Main {
    public static void main(String[] args) {
        Hewan Elang = new Hewan("Elang");
        Hewan Kucing = new Hewan("Kucing");

        Elang.beratHewan(5);
        Elang.jumlahKakiHewan(2);
        Elang.cetakHewan();

        Kucing.beratHewan(10);
        Kucing.jumlahKakiHewan(4);
        Kucing.cetakHewan();
    }
}
