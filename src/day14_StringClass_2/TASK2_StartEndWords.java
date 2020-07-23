package day14_StringClass_2;





import java.util.Scanner;

/*

2. Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"
 */
public class TASK2_StartEndWords {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enetr first word");
        String word1 = input.next();

        System.out.println("Enter Second Word");
        String word2 = input.next();

        int leinght1 = word1.length();
        int leinght2 = word2.length();

        if (leinght1 == 5 && leinght2 == 5) {

            if (word1.charAt(leinght1-1) == word2.charAt(0)) {
                System.out.println("Fizz");
            } else {

                System.out.println("buzz");
            }
        }else {
            System.out.println("");


        }
    }
}





