package day12_ScannerNext;
import java.util.Scanner;
public class Ternaries_Practice {
    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("Enter status code");
        int statusCode = scan.nextInt();
        String result = "";

        if (statusCode ==200){
            result = "Ok";

        }else if ( statusCode ==201){
            result ="Created";
        }else if (statusCode == 202){
            result = "Accepted";
        }else {
            result ="Invalid Status Code";
        }
        System.out.println(result);
        System.out.println("Enter status code");

        int statusCode2 = scan.nextInt();
        String result2 = (statusCode2 ==200) ? "ok" : (statusCode2 ==201)? "Created" : (statusCode2== 202) ? "Accepted"
                : "Invalid statsu Created";
        System.out.println(result2);



    }
}
