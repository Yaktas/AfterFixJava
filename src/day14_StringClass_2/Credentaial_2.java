package day14_StringClass_2;

import java.util.Scanner;

public class Credentaial_2 {

    /*
    valid credentials are :
       usernaem : cybertek
       password :  cybertekschool
       username and password should not be empty
       if they are empty ==> please enter the credentaials
       if user entered both valid username and password ==> log in
       if useer entered invalid username and password ==> incorect
       if valid username  but invalid password ==> passowrd is incorrect
       if both password and username are invalid ==> invalid username and password
     */
    public static void main(String[] args) {
       /* String username = "cybertek";
        String PassWord = "cybertekschool";

        String passWord = "cybertekschool";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your UserName ");
        String inputuserNAme = input.next();

        System.out.println("Enter your Password ");
        String inputpassWord = input.next();

        if (!inputuserNAme.isEmpty() && !inputpassWord.isEmpty()) { // username and password are not empty
            System.out.println("Username and Pasword are incorrect");
            if (inputuserNAme.equals(username) && inputpassWord.equals(passWord)) { //
                System.out.println("Logged in");
                // other way to do is ;
                // boolean loggedin =  inputuserNAme.equals(username) && inputpassWord.equals(passWord;
                // boolean invalidloggedin = ! inputuserNAme.equals(username) && inputpassWord.equals(passWord;
            }else if (!inputuserNAme.equals(username) && inputpassWord.equals(passWord) ) {
                System.out.println("username is not valid but Password is valid");
            }else if (inputuserNAme.equals(username)&& !inputpassWord.equals(passWord)) {
                System.out.println("Username is valid but Password is not valid");

            } else {
                System.out.println("please enter the credentaials");

                */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUsername = input.nextLine();

        System.out.println("Enter your password");
        String inputPassWord = input.nextLine();


        boolean logedIn = inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered both valid username and password

        boolean InvalidUserName = !inputUsername.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        // user entered invalid username and valid password

        boolean InvalidPassWord = inputUsername.equals("Cybertek") && !inputPassWord.equals("cybertekschool");
        // username is valid, but password is invalid

        if (!inputUsername.isEmpty() && !inputPassWord.isEmpty()) {  // username and passowrd are not empty

            if (logedIn) {
                System.out.println("Logged in");
            } else if (InvalidUserName) {
                System.out.println("Password is correct, username is incorrect");
            } else if (InvalidPassWord) {
                System.out.println("Username is correct, password is incorrect");
            } else {
                System.out.println("Both username and password are incorrect");
            }


        } else { // username and passowrd are empty
            System.out.println(" please enter the credentials");
        }

    }
}

