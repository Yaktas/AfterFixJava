package day14_StringClass_2;
/*

ask user to enter two words
input: apple
       banana
output: ppleanana
 */


import java.util.Scanner;

public class CombinetwoStrings_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");

        String word1 = input.next();

        word1 = word1.substring(1,word1.length());
        System.out.println("Enter your second word:");

        String word2 =input.next();
        word2 = word2.substring(1,word2.length());
        String result = word1 + word2;
        System.out.println(result);

    }
}
