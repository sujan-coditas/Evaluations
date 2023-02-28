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
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            char[] ch = input.toCharArray();

            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                count++;
                str += ch[i];
            }
        }
        System.out.println("count vowels is: " + count);
        System.out.print("String vowels :" + str);

    }


    public void countConsonants(String input) {
        String str = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' ) {
                c += 1;
            }

            str += c;
        }

        System.out.print("String consonants: " + str);
    }
}
    public class Q1_TotalCharCount {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter String:");
            String input = sc.nextLine();
            CharCountDemo charCountDemo = new CharCountDemo();

            boolean flag = true;
            while (flag) {
                System.out.println("\nEnter options \n 1. count token \n 2. count vowels \n3. print consonants increment \n 4. Exit");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        charCountDemo.displaytokencount(input+"\n");
                        break;
                    case 2:
                        charCountDemo.countvowels(input+"\n");
                        break;
                    case 3:
                        charCountDemo.countConsonants(input+"\n");
                        break;
                    case 4:
                         flag=false;
                         break;

                    default:
                        System.out.println("enter valid option"+"\n");
                }
            }

        }
    }




