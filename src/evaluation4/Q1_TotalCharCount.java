package evaluation4;

import java.util.Scanner;
import java.util.StringTokenizer;

class CharCountDemo {
    public void displaytokencount(String input) {
        StringTokenizer stringTokenizer = new StringTokenizer(input);

        System.out.println("token count is : " + stringTokenizer.countTokens());

    }

    public void countvowels(String input) {
        int count = 0;
        String str = null;
        for (int i = 0; i < input.length(); i++) {
            char[] ch = input.toCharArray();
            str = "";
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
                str += ch[i];
            }
        }
        System.out.println("count vowels is: " + count);
        System.out.print("String vowels :" + str);


    }


//    public void countConsonants(String input) {
//        for (int i = 0; i < input.length(); i++) {
//            char[] ch = input.toCharArray();
//            int count = 0;
//            {
////                if (ch = 'a' || ch = 'e' || ch = 'i' || ch = 'o' || ch = 'u') {
////                    count++;
//
//                }
//            }
//           // System.out.println("count vowels is: " + count);
//
//        }
    }


public class Q1_TotalCharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String input=sc.nextLine();
        CharCountDemo charCountDemo= new CharCountDemo();
        System.out.println("Enter options 1. count token  2. count vowels 3. print consonants increment");
        int option=sc.nextInt();
        switch(option){
            case 1:
                charCountDemo.displaytokencount(input);
                break;
            case 2:
                charCountDemo.countvowels(input);
                break;

            default:
                System.out.println("enter valid option");
        }
    }
}

/*
* Enter String:
sujan shaikh
Enter options 1. count token  2. count vowels 3. print consonants increment
1
token count is : 2
*
*
* Enter String:
i am sujan
Enter options 1. count token  2. count vowels 3. print consonants increment
2
count vowels is: 4
String vowels :

* */
