package day14_StringClass_2;

import java.util.Scanner;

public class TASK1_CheckWords {
    /*
    Write a program CheckWords:
        Program accepts 3 words and :
        - if they are same length:      print "All words are same length"
        - if some same length and others not:    print "Not Same nor Different lengths"
        - if all different length :  print "All different length

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Word");
        String word1 =input.nextLine();

        System.out.println("Enter your Second Word");
        String word2 = input.nextLine();

        System.out.println("Enter your Third Word");
        String word3 = input.next();

        int  lenght1 = word1.length();
        int  lenght2 = word2.length();
        int  lenght3 = word3.length();

        boolean NotSame = lenght1!=lenght2 && lenght2!=lenght3 && lenght1!=lenght3; //none of them are same

        if (lenght1==lenght2 && lenght2==lenght3 ){
            System.out.println("Print All words are same leinght");
        }else if ( NotSame) {
            System.out.println("All Different lenght");
        }else {
            System.out.println("Not Same nor Different leinght");
        }


    }
}
