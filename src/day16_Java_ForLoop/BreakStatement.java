package day16_Java_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello World");
            // wothout iterations break statement run forloop just one so print will one time
            //without break statement oteration it will print 5 times then.
            //break statement stops iteration
            if (i == 3) { // when i is equal 3 it will print out
                break;    //if I put break and if statemets after print statement it will print 3 times.
            }
        }

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
            if (i == 'd') {
                break;

            }
        }
    }

}