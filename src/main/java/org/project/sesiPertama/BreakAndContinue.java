package org.project.sesiPertama;

public class BreakAndContinue {
    public static void main(String[] args) {
        /**
         * BREAK, digunakan saat perulangan
         */

        for (int i = 0; i < 9; i++) {
            if(i == 4){
                break;
            }
            System.out.println("Number: " +i);
        }

        //Jika sudah sampai angka 4 maka program berhenti

        for (int j = 0; j < 9; j++) {
            if(j == 4 || j == 5){
                continue;
            }
            System.out.println("Number: " +j);
        }
    }
}
