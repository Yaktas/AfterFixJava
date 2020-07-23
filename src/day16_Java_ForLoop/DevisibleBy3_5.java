package day16_Java_ForLoop;

public class DevisibleBy3_5 {
    public static void main(String[] args) {

         /*
     1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
     */

        // teachers out put
        for(int i = 1; i <= 100; i++ ){

            if(i % 2 != 0) {
                if(i %3 ==0 && i %5 ==0) {
                    System.out.print(i + " ");



                        /*
                        for(int i = 1; i <= 100; i++) {
            if(i % 2 != 0) {  // to get even number remove ! out == you will get even number
                if(i %3 ==0 && i %5 ==0) {

                    System.out.println(i+" ");

*/
                }
            }
        }
    }

}