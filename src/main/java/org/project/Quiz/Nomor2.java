package org.project.Quiz;

public class Nomor2 {
    public static void main(String[] args) {
        int[] numbers = {2, 6, 9, 4, 3};

        int lengthOfNumber = numbers.length;

        for (int i = 0; i<= lengthOfNumber; i++){
            if (numbers[i] == 4){
                break;
            }

            System.out.println("Output: " + numbers[i]);
        }
    }
}
