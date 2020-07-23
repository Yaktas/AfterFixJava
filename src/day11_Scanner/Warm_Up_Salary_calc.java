package day11_Scanner;

import java.util.Scanner;
public class Warm_Up_Salary_calc {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);  // This how we create scanner object

        System.out.println("Enter Your Salary:");

        int salary = input.nextInt();

        System.out.println("Enter State Tax Rate: ");

        byte stateTax = input.nextByte();

        double stateTaxPercentage = stateTax/100.0;


        System.out.println("Enter the federal tax rate :");

        byte federalTax = input.nextByte();

        double federalTaxPercentage = federalTax /100.0;

        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary after tax is: $"+ salaryAfterTax);








    }
}