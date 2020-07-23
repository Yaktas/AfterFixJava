package day12_ScannerNext;
import java.util.Scanner;
public class Scanner_nextLine_Practice {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        // write program for full adress as this below
        //fullAdress ;Building-number Street,city,state,zipcode

        System.out.println(" Enter the building number ");
        int Bnumber = input.nextInt();
        // System.out.println("Building Numer is: " +  Bnumber);

        input.nextLine();

        System.out.println("  Enter the Street name");
        String Streetname = input.nextLine();

        //System.out.println("Street name is:" + Streetname);


        System.out.println(" Enter the zipcode");
        int zipCode = input.nextInt();


        //System.out.println("The zipCode is:" + zipCode);

        input.nextLine();

        System.out.println(" Enter your city , State " );
        String cityName = input.nextLine();

        String fullAdress = Bnumber +" " + Streetname + "  \n" +cityName  + " " +zipCode;

        System.out.println(fullAdress);
        input.close();


    }
}
