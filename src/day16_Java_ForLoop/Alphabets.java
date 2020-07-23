package day16_Java_ForLoop;

public class Alphabets {
    public static void main(String[] args) {
        String UpperCase = "";
        String Lowecase = "";

        for (char ch = 'A'; ch <= 'Z'; ch++) {

            UpperCase += ch;
        }
        System.out.println(UpperCase);

        for (char ch = 'a'; ch <= 'z'; ch++) {
            Lowecase += ch;

        }
        System.out.println(Lowecase);

        String result = "";

        for (int i = 0; i <= UpperCase.length() - 1; i++) {
            result += UpperCase.charAt(i) + "" + Lowecase.charAt(i) + " ";
        }
        System.out.println(result);

        //second solution
        int a = 97;
        int A = 65;

        String result2 = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) (A + i);  // upper case characters
            //          65
            char ch2 = (char) (a + i);
            //                97+0

            result2 += ch + "" + ch2 + " ";
        }

        System.out.println(result2);
    }
}