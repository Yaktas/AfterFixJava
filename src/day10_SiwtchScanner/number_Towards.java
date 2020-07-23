package day10_SiwtchScanner;

public class number_Towards {
    public static void main(String[] args) {
        //0~9
        /*
        write a java program that can convert numbers between 0-9 tpo words
         */

        int num = 5;
        String word = (num ==0)? "Zero" : (num ==1)? "One" : (num==2)? "Two" : (num==3)? "Three" : (num==4)? "Four" : (num == 5)? "Five" : (num==6)? "Six"
                : (num==7)? "Seven" : (num==8)? "Eight": (num==9)? "Nine" : "invalid";
        System.out.println(word);
    }


}
