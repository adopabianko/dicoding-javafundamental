package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        /* contoh pemakaian IF tiga kasus : wujud air */

        /* kamus */
        int T;

        /* Program */
        System.out.println("contoh IF tiga kasus");
        System.out.println("Suhu (der, C) = ");

        // Scanner untuk masukan suhu air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); // masukkan suhu air dengan tiga int
        //proses pengecekan dengan if
        if (T < 0) {
            System.out.println("Wujud air beku " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println ("Wujud air cair " + T);
        }
        else if (T > 100) {
            System.out.println("Wujud air uap/gas " + T);
        }

    }
}
