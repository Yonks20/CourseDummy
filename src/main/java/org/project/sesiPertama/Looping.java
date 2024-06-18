package org.project.sesiPertama;

public class Looping {
    public static void main(String[] args) {

//        Do While
        int number = 10;

        do{
            //System.out.println("Number : " + number);
            number--;
        }
        while(number > 0);


        int angka = 20;

        while(angka < 30) {
            //System.out.println("Angka :" + angka);
            angka++;

        }

        for(int j = 0; j<10; j++){
            //System.out.println("Loop: "+ j);
        }

        for(int i = 0; i<10;i++){
            //System.out.println("Loop: "+ i);
        }
        //For Each

        String[] names = {"Yonkie", "Yudha", "Ardika"};
        for(String name:names){
            System.out.println("Hello "+name);
        }

        //Mengetahui Ukuran Array
        int ukuranNama = names.length;
        for(int i = 0; i < ukuranNama; i++){
            String nama = names[i];
            System.out.println("Hello : " +nama);
        }

    }
}

