package day12_ScannerNext;
import java.util.Scanner;
public class SalaryCalculator_Scanner {
    /* ask the user enter salary
    ask the user enter full name
    ask the user company name
    ask the user enter SSn
    ask the user enter JobTitle
     */




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary = input.nextDouble();

        input.nextLine();
        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your Company name");
        String CompanyName =input.nextLine();

        System.out.println("Enter your SSN");
        Long SSN = input.nextLong();

        input.nextLine();
        System.out.println("Enter job Title");
        String jobTitle = input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job Title is: "+jobTitle);
        System.out.println("Company Name: "+CompanyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);





    }
}
