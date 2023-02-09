package Evaluation2;

import sun.util.resources.LocaleData;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Question2 {
    public static void main(String[] args) {
        LocalDate currentdate= LocalDate.now();
        DayOfWeek dow= currentdate.getDayOfWeek();

        switch (dow){
            case MONDAY:
                System.out.println("it is a start of week");
                break;
            case TUESDAY:
                System.out.println("it is a second day of week");
                break;
            case WEDNESDAY:
                System.out.println("it is a third day of week");
                break;
            case THURSDAY:
                System.out.println("it is a fourth of week");
                break;
            case FRIDAY:
                System.out.println("it is a fifth of week");
                break;

            case SATURDAY:
                System.out.println("it is a weekend !! majjani life ");
                break;

            case SUNDAY:
                System.out.println("last day of weekend");
                break;

            default:
                System.out.println("it is a fourth of week");
                break;

        }
    }
}
/* ======output======
* it is a fourth of week
 */
