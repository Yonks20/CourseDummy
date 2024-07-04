package org.project.Homework3Soal2;

import java.util.Date;

public class Payment {
    public String bankName;
    public int virtualAccountNumber;
    public int creditCardNumber;
    public double amount;
    public Date dueDate;
    public boolean timeout;


    //Buat Paramaterized Constructor
    public Payment(String bankName, int virtualAccountNumber, int creditCardNumber, double amount, Date dueDate, boolean timeout){
        this.bankName = bankName;
        this.virtualAccountNumber = virtualAccountNumber;
        this.creditCardNumber = creditCardNumber;
        this.amount = amount;
        this.timeout = false;
        this.dueDate = dueDate;
        this.timeout = timeout;
    }

    //constructor


    public static void main(String[]args){
        Payment payment = new Payment("Bank Name",1,1,100,new Date(),true);
        if(isValidateNumber){
        }
    }

    private static boolean isValidateNumber(int virtualAccountNumber, int creditCardNumber) {
        if (null != virtualAccountNumber || null != creditCardNumber){
            return true;
        }
    }
}
