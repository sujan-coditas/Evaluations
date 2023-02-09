package Evaluation2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        LocalDate currentdate= LocalDate.now();
        DayOfWeek dow= currentdate.getDayOfWeek();
        String days=String.valueOf(dow);
        String weekDays[]={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        for(int i=0;i< weekDays.length;i++){
            if(days==weekDays[i]){
                continue;
            }
            System.out.println(weekDays[i]);
        }

    }
}

/*======OUTPUT=======
* MONDAY
TUESDAY
WEDNESDAY
FRIDAY
SATURDAY
SUNDAY*/
