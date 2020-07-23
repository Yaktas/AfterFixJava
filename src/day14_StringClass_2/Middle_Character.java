package day14_StringClass_2;

import java.util.Scanner;

/*
 Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph

 */
public class Middle_Character {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();  // bananas
        // 0123456


        String middleCharacter = "";  // to store the middle character at yje end
        int totalChars = word.length();  //7
        int middleNumber = totalChars / 2;  //7/2 =3
        if (totalChars  != 0){ //odd numbers
            middleCharacter += word.charAt(middleNumber);

            //      middleCharacter = middleCharcater + word.charAt(middleNumber); it will give the same result


        }
        System.out.println(middleCharacter);

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.next();

        String middleChacter = "";
        int totalChars  = word.length();
        int middleNum = totalChars/2;

        if(totalChars %2!=0)    {
            middleChacter = middleChacter + word.charAt(middleNum);

        }else {
            middleChacter = middleChacter + word.charAt(middleNum-1)+word.charAt(middleNum);

            //   middleChacter +=  word.charAt(middleNum-1)+word.charAt(middleNum);      // it willl give you numer not letter
        }
        System.out.println(middleChacter);
    }
}