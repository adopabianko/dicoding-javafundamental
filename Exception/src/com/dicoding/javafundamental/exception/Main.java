package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            // Mencoba membaca berkas latihan.txt
            File file = new File("latihan.txt");
            FileReader fr = new FileReader(file);

            // jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");
        } catch (FileNotFoundException e) {
            // jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
    }
}
