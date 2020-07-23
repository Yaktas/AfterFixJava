package day13_StringClass;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNum = input.next();

        input.nextLine();
        System.out.println("Enter your street adress");
        String streetAdress = input.nextLine()
                ;
        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your State");
        String state = input.nextLine();
        System.out.println("Enter your zipcode");
        String zipCode = input.next();

        input.nextLine();
        System.out.println("Enter your full Name");
        String fullName =input.nextLine();

        String result= "Ship to:    " +fullName + "\n\t\t\t"+ buildingNum+" "  + streetAdress + "\n\t\t\t"+ cityName + ", "+ state+" " +zipCode;
        System.out.println(result);


        ;

    }
}
