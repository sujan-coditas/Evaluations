package Evaluation5;

import java.util.Scanner;

import static Evaluation5.NewConnection.*;

public class Prepaid {

    Scanner sc=new Scanner(System.in);
    int validity=30;

    public void showOptions(){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter option : \n 0. Check Balance \n 1. Recharge");
        int userInput=sc.nextInt();
             switch(userInput){
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
    }
    public void  checkBalance(){
        int usergeneratedNumber= mobilenumber;
        System.out.println("Enter mobile number ");
        int number=sc.nextInt();
        if(usergeneratedNumber==number){
            System.out.println("User Name :" + name);
            System.out.println("Balance :" + balance);
            System.out.println("Validity :" + validity);
        }
        else{
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


