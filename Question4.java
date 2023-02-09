package Evaluation2;

public class Question4 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9,10};

        int sum=0,multiplication=1;
        for(int i=0;i<array.length;i++){
            if(i%2 == 0){
                sum+=array[i];
            } else if (i% 2 !=0) {
                multiplication*=array[i];
            }

        }
        System.out.println("sum is : "+ sum);
        System.out.println("multiplication is : "+ multiplication);

    }
}

/*====OUTPUT=====
*
* sum is : 25
multiplication is : 3840
*
* */
