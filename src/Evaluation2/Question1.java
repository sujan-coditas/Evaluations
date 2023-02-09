package Evaluation2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter details as id,firstname,lastname,education,city,marks");
        int id= sc.nextInt();
        String firstName=sc.next();
        String lastName=sc.next();
        String education=sc.next();
        String city=sc.next();
        int marks=sc.nextInt();

        System.out.println( id);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(education);
        System.out.println(city);
        System.out.println(marks);

        if(marks>=70) {
            System.out.println("you  Passed with distinction");
        } else if (marks>=60 || marks <70) {
            System.out.println("you  Passed with first class");

        }
        else if (marks<60 || marks >=55){
            System.out.println("you  Passed with Higher Second class");

        }
        else if (marks<55 || marks >=50){
            System.out.println("you  Passed with  Second class");

        }
        else if (marks<50 || marks >=35){
            System.out.println("you  passed  class");

        }
        else {
            System.out.println("Failed");
        }


    }
}
/* ==== OUTPUT======
*
* enter details as id,firstname,lastname,education,city,marks
1
sujan
shaikh
btech
nanded
89
1
sujan
shaikh
btech
nanded
89
you  Passed with distinction

Process finished with exit code 0
*/
