package day12_ScannerNext;
import java.util.Scanner;
public class Scanner_Next {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        //    String str = scan.next();  // next() only takes first word
        // 7921
        String fullAdress ="";
        //Jones Branch Dr, Mclean VA, 22034
        System.out.println("Enter the number of the building");
        short Bnumber = input.nextShort();
        fullAdress =+ Bnumber + "";

        System.out.println("Enter the street Name ");
        String streetName = input.next();
        fullAdress  += streetName +" ";

        System.out.println("Enter the type  of the road");
        String roadType = input.next();
        fullAdress +=roadType+ ", ";

        System.out.println("Enter cityname , State, Zipcode");
        String cityname = input.next();
        fullAdress +=cityname+" ";

        String state = input.next();
        fullAdress += state+ " ";

        String zipCode = input.next();
        fullAdress += zipCode+ " ";

        System.out.println("The Adress is: " +fullAdress);







    }
}