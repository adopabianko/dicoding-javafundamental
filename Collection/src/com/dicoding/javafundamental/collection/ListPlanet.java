package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        // deklarasi Array
        String[] heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke list

        System.out.println("List planet awal:");
        for (int i = 0; i < planets.size(); i++) { // method size() untuk mendapatkan ukuran list
            // method get() untuk melihat isi list pada index i
            System.out.println("\t index-" + i +" = " + planets.get(i));
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari list

        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-" + i + " = " + planets.get(i));
        }
    }
}
