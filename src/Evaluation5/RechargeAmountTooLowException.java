package Evaluation5;

public class RechargeAmountTooLowException extends  Exception{
    RechargeAmountTooLowException(){
        System.out.println("Recharge amount should be at least 50");
    }
}
