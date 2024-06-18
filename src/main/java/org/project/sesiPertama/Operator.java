package org.project.sesiPertama;

public class Operator {
    public static void main(String[] args) {
        /**
         * OPERATOR ARITMATIKA
         *
         */

        int a = 3;
        int b = 4;
        int c = 5;
        int d = 6;
        //Penjumlahan
        int hasilPenjumlahan = a + b;
        System.out.println("Hasil Penjumlahan : " +hasilPenjumlahan);

        //PENGURANGAN
        int hasilPengurangan = c - b;
        System.out.println("Hasil Pengurangan : " +hasilPengurangan);

        //Perkalian
        int hasilPerkalian = a * b;

        //Pembagian
        int hasilPembagian = c/d;

        //MODULUS
        int hasilModulus = d%a;
        System.out.println("Hasil Modulus : " +hasilModulus);

        /**
         * OPERATOR RELASIONAL
         * DIGUNAKAN UNTUK MEMBANDINGKAN DUA BUAH NILAI
         * KARNA DIGUNAKAN UNTUK PERBANDINGAN, MAKA HASIL PERBANIDNGAN NILAI TRUE atau FALSE
         *
         *
         */

        // Sama dengan '=='
        boolean isTrue = (a==b);
        System.out.println("Hasil Perbandingan sama dengan : " + isTrue);

        //TIDAK SAMA DENGAN !=
        boolean isTidakSamaDengan = a!=b;

        //Lebih Besar '>'
        boolean isLebihBesar = a>b;

        //lebih Kecil '<;
        boolean isLebihKecil = a<b;

        //Lebih Besar sama dengan'>='
        boolean isLebihBesarSamaDengan = a>b;

        //lebih Kecil '<=;
        boolean isLebihKecilSamaDengan = a<b;


        /**
         * OPERATOR LOGIKA
         */
        boolean isA = true;
        boolean isB = false;
        boolean isC = true;

        //LOGIKA AND => '&&'

        boolean isAnd = isA && isB;

        //Operator Increment dan decrement

        /**
         * OPERATOR TERNARY (KONIDISIONAL)
         * RUMUS:
         * HASIL = KONDISI? ValueifTrue : ValueIfElse
         */

        int hasilTernaryOperator = ( 3 < 4)? 6 :9;

        boolean hasilTernary = (3<4)? true : false;
    }
}
