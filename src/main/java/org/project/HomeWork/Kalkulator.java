package org.project.HomeWork;

public class Kalkulator {

    // Method statis untuk menjumlahkan dua bilangan
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Method statis untuk mengalikan dua bilangan
    public static int kali(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int hasilTambah = Kalkulator.tambah(12, 3);
        System.out.println("Hasil penjumlahan: " + hasilTambah);

        int hasilKali = Kalkulator.kali(4, 12);
        System.out.println("Hasil perkalian: " + hasilKali);
    }
}
