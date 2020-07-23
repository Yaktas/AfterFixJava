package day14_StringClass_2;

import java.util.Scanner;

public class credentials {
    public static void main(String[] args) {
        /*
        userName = cybertek
        password: cybertekschool

         */
        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUserName = input.next();


        System.out.println("Enter your password");
        String inputPassword = input.next();

        boolean validCredantials = inputUserName.equals(validUserName) && inputPassword.equals(validPassWord);
        // we can write this style too wirh boolean instead if statements or we can put this into if statements

        if (validCredantials){
            System.out.println("Log in succesfully");
        }else {
            System.out.println("Invalid credantials");

        }
    }
}
