package day16_Java_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.println("Enter your word");
        String word = input.nextLine();

        String reverseWordd = "";

        for (int i = word.length()-1; i >= 0; i--){
            reverseWordd += word.charAt(i);
        }
        System.out.println(reverseWordd);


    }
}
/*
        Teacher's done
        System.out.println("Enter your words");
        String word =    input.nextLine();   //Java
        //0123
        String reversedWord = ""; //avaJ

        for(int i = word.length()-1; i >= 0; i-- ){
            reversedWord    +=  word.charAt(i);
        }

        System.out.println(reversedWord);



    }

}
*/
