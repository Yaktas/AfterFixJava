package day14_StringClass_2;

public class Stringmanipulations_5 {
    public static void main(String[] args) {

        String str =" ";
        boolean bool1 =  str.isEmpty(); // false if you space in ==>string " "

        System.out.println(bool1);
        String str2 = " ";
        boolean bool2 = str.equals(str2); // true bc str has space
        System.out.println(bool2);

        String username = "";
        if (username.isEmpty()) {
            System.out.println("please provide the user name first");
        }
        String z1 = "Tiger";

        String z2 = new String("Tiger");

        String z3 = "Tiger";

        String z4 = "tiger";

        // ==
        System.out.println( z1 == z2 ); // false
        System.out.println(z2 == z3);  // false
        System.out.println( z1 == z3 ); // true, same object

        // equals():
        System.out.println( z1.equals(z2)  );   // true
        System.out.println( z2.equals(z3) );    // true
        System.out.println(z1.equals(z3));  // true
        System.out.println(z3.equals(z4)); // false

        /*
        userName: cybertek
        passWord: cybertekschool
         */
    }
}
