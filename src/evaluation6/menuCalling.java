package evaluation6;

import java.util.Scanner;
/* considering one teacher manny student */

public class menuCalling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            Operations operations=new Operations();
            System.out.println("Enter choice : \n 0: EXIT \n 1: Student  \n 2: Teacher  \n 3: query 5 \n 4: Query 6 \n 5: Query 7 ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    exit = true;
                    break;

                case 1:
                    operations.insidermenustudent();
                    break;

                case 2:
                    operations.insidermenuteacher();
                    break;

                case 3:
                    operations.Query5();
                    break;

                case 4:
                    operations.Query6();
                    break;

                case 5:
                    operations.Query7();
                    break;


                default:
                    System.out.println("Enter Valid Input");
                    break;
            }
        }
    }
}
