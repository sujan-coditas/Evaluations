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
            if(selection!=0){
                System.out.println("enter \n 0. EXIT \n 1. Main menu options ");
                selection= sc.nextInt();
            }
        }
        while (selection == 1);
    }
}

/*
* Enter 0.EXIT
 1. Prepaid user
 2. New Connection
3. View All Users
2
Enter name
sujan
Enter Email
sujan@gmail.com
Enter Adddress
nanded
Enter aadhar number
34565677
Enter Sim Type   1. prepaid  2. postpaid
prepaid
Enter name
your mobile number is :
0104764892
104764892
Enter Initial Balance
100
enter 0. EXIT
 1. Options
1
Enter 0.EXIT
 1. Prepaid user
 2. New Connection
3. View All Users
1
 Enter option :
 0. Check Balance
 1. Recharge
0
Enter mobile number
104764892
User Doesnot Exist

enter 0. EXIT
 1. Options
1
Enter 0.EXIT
 1. Prepaid user
 2. New Connection
3. View All Users
1
 Enter option :
 0. Check Balance
 1. Recharge
1
Enter Recharge
50
150
validity is : 60
enter 0. EXIT
 1. Options
1
Enter 0.EXIT
 1. Prepaid user
 2. New Connection
3. View All Users

*/
