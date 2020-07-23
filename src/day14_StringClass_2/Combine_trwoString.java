package day14_StringClass_2;


import java.util.Scanner;

/*
1. Ask the user two words.print the first word second word ,second word,first word
input one
two
output:
onetwotwoone
 */
public class Combine_trwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");

        String word1 = input.next();
        System.out.println("Enter your second word:");

        String word2 =input.next();
        String result = word1.concat(" "+word2).concat(" " +word2).concat(" " +word1);
        System.out.println(result);


    }
}
