package Evaluation5;

import java.util.Scanner;

import static Evaluation5.NewConnection.*;

public class Prepaid {

    Scanner sc=new Scanner(System.in);
    int validity=30;
    long usergeneratedNumber = NewConnection.mobilenumber;

    public void showOptions() {
        Scanner sc = new Scanner(System.in);
        int selectoption = 1;
        do {
            System.out.println(" Enter option : \n 0. Check Balance \n 1. Recharge");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 0:

                    checkBalance();
                    break;

                case 1:
                    Recharge();
                    break;

                default:
                    System.out.println("Enter valid option");
                    break;
            }
            if (selectoption != 0)
                System.out.println("\n 0.Exit \n 1.Continue ");
            selectoption=sc.nextInt();
        } while (selectoption == 1);
    }
    public void checkBalance(){
        System.out.println("Enter mobile number ");
        long number = sc.nextLong(); // change data type to long
        boolean flag=false;
        if(usergeneratedNumber == number){
            System.out.println("User Name :" + name);
            System.out.println("Balance :" + balance);
            System.out.println("Validity :" + validity);
            flag=true;
        }
        if(flag){
                try{
                    throw new UserDoesnotExistException();
                } catch (UserDoesnotExistException e) {
                    System.out.println();
                }
            }
        }

    public void Recharge(){
        System.out.println("Enter Recharge");
        int rechargeAmount=sc.nextInt();
        balance+=rechargeAmount;
        System.out.println(balance);
        validity+=30;
        System.out.println("validity is : "+ validity);
    }
}


