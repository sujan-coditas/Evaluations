package Evaluation5;

import java.util.Scanner;

public class SIMCompany {
    public static void main(String[] args) {
        int selection = 1;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter 0.EXIT \n 1. Prepaid user \n 2. New Connection \n3. View All Users");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    selection=0;
                    break;
                case 1:
                     Prepaid prepaid=new Prepaid();
                     prepaid.showOptions();
                     break;

                case 2:
                    NewConnection newConnection=new NewConnection();
                    newConnection.takeUserDetails();
                    break;

                case 3 :
                    ViewAllUsers viewAllUsers=new ViewAllUsers();
                    viewAllUsers.viewUsers();

                    break;

                default:
                    System.out.println("Enter Valid option ");
                    break;
            }
            if(selection==1){
                System.out.println("enter 0. EXIT \n 1. Options");
                choice= sc.nextInt();
            }
        } while (selection == 0);
    }
}
