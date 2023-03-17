package evaluation6;

import java.util.Scanner;
/* considering one teacher manny student */

public class menuCalling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            Operations operations=new Operations();
            System.out.println("Enter choice : \n 0: EXIT \n 1: Student Insertion \n 2: Student  Update \n 3: Student Retrieve \n 4: Student Delete \n 5: query 5 \n 6: Query 6 \\n 7: Query 7 ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    exit = true;
                    break;

                case 1:
                    operations.Studentinsert();;
                    break;

                case 2:
                    operations.Studentupdate();
                    break;

                case 3:
                    operations.StudentRetrive();
                    break;

                case 4:
                    operations.StudentDelete();
                    break;

                case 5:
                    operations.Query5();
                    break;

                case 6:
                    operations.Query6();
                    break;

                case 7:
                    operations.Query7();
                    break;

                default:
                    System.out.println("Enter Valid Input");
                    break;
            }
        }
    }
}
