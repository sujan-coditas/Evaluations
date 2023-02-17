package Evaluation3;

import java.util.Scanner;

class Vehicle {
     static String Company="Honda";
     static int Price=100000;

    public void displayVehicle(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1. LightMotorVehicle  2. HeavyMotorVehicle");
        int option=sc.nextInt();
        System.out.println("how many entries u want to enter");
        int n=sc.nextInt();
        switch(option){

            case 1:
                for(int i=1;i<=n;i++) {
                    System.out.println("Enter mileage : ");
                    int mileage = sc.nextInt();
                    System.out.println("mileage is : " + mileage);
                }
                break;

            case 2:
                for(int i=1;i<=n;i++) {

                    System.out.println("Enter capacityInTons : ");
                    int capacityInTons = sc.nextInt();
                    System.out.println("mileage is : " + capacityInTons);
                }
                 break;

            default:
                System.out.println("enter valid mm option");
                break;
        }
    }
}
public class VehicleExample {
    public static void main(String[] args) {
 Vehicle vehicle=new Vehicle();

        vehicle.displayVehicle();

    }
}
/*=========OUTPUT==========
* Enter 1. LightMotorVehicle  2. HeavyMotorVehicle
1
how many entries u want to enter
2
Enter mileage :
10
mileage is : 10
Enter mileage :
15
mileage is : 15

*/