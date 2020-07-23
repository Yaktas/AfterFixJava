package day14_StringClass_2;

public class EqualsIgnoreCase_Contains {
    public static void main(String[] args) {


        String str1 ="CYBERTEK";
        String str2 = "cybertek";
        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); // true


        String s1 ="Cybertek School";
        boolean r1 =   s1.contains("School"); // true it is case sensetive be carfeull
        System.out.println(r1);

        System.out.println("====================");


        // endsWith
        String s4 ="Cybertek School";







    }
}
