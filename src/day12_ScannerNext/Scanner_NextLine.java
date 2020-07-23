package day12_ScannerNext;
import java.util.Scanner;
public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //lets say 13 and enter

        System.out.println("Enter some number");
        int num = input.nextInt(); //13 will be taken out
        System.out.println(num);


        input.nextLine(); // Enter will be assigned  to this method  //used for taking out "Enter"
        System.out.println("Enter your name:");
        String name = input.nextLine(); //enter NextLine takes evrything entered

        System.out.println(name);

    }
}
