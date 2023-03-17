package Evaluation5;


import java.util.Random;
import java.util.Scanner;


public class NewConnection {
   static int balance;
   static long mobilenumber;
   static  String name;
    public void takeUserDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter Email");
        String email = sc.nextLine();
        System.out.println("Enter Adddress");
        String address = sc.nextLine();
        System.out.println("Enter aadhar number");
        int aadhar = sc.nextInt();
        System.out.println("Enter Sim Type   1. prepaid  2. postpaid");
        String simType = sc.next();

        System.out.println("Enter initial recharge balance : ");
        int balance= sc.nextInt();
        if (balance <= 0) {
            try {
                throw new RechargeAmountTooLowException();
            } catch (RechargeAmountTooLowException e) {
                System.out.println("Error: Recharge amount is too low!");
            }
        }
        if(balance >0) {
            System.out.println("your mobile number is :");
            generateNumber();
            System.out.println("Intitial Balance is : " + balance);
        }

        }


     public long generateNumber(){
        Random rand = new Random();
         long mobilenumber = rand.nextInt((int) Math.pow(10, 10));
        System.out.println(String.format("%010d", mobilenumber));
        return mobilenumber;
    }
}

