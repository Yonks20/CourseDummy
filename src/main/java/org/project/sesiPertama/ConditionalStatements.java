package org.project.sesiPertama;

public class ConditionalStatements {

    public static void main(String[] args) {

        //jika (konidsi A) Maka (Keputusan)

        //if else
        int angka = 10000;

        if(angka == 10000){
            System.out.println("Cetak Angka 10000");
        }else{
            System.out.println("Angka bukan 10000");
        }


        //IF, ELSE IF, ELSE
        if(angka == 9000){
            System.out.println("Ini angka 900");
        }else if(angka == 90000){
            System.out.println("ini angka 9000");
        }else{
            System.out.println("Ini angka 90000"); //keputusan 3
        }

        //SWITCH STATEMENT
        //mirip dengan if else bedanya di syntax

        String alphabet = "A";
        //cek variable alphabet
        switch(alphabet){
            case "B"://jika si alphabet itu b
                System.out.println("Ini B");
                break;
            case "A":
                    System.out.println("Ini A");
                    break;
            default:
                System.out.println("Ini Default");
                break;
        }

        //? :
        //RUMUS  -> tipe_data nama_variable = Kondisi 1 ?

        int number = 10;
        String hasil = number == 9 ? "Ya ini nomor 9" : "Bukan ini bukan nomor 9";

        System.out.println("Ini hasil " + hasil);
    }

}
