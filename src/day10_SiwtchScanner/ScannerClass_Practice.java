package day10_SiwtchScanner;
import java.util.Scanner;

public class ScannerClass_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //write aprogram that asks user to enter num1 and num2 , and prints sum

        /*
        System.out.println("Enter your first number");

             byte num1 = scan.nextByte();

        System.out.println("Enter your second number");

              byte num2 = scan.nextByte();

              int total =(num1 +num2);


              System.out.println("The sum of those numbers are : " + total);
              //other way
        //System.out.println("The sum of those numbers are : " + (num1 +num2))); it  give syou resuly too
         */

        System.out.println("Enter your first number");

        short num1 = scan.nextShort();

        System.out.println("Enter your second number");

        short num2 = scan.nextShort();

        int total =(num1 +num2);


        System.out.println("The sum of those numbers are : " + total);

        // it works with Short as well as byte
        // you have to defibe here short num1 = scan.nextShort();





    }
}
