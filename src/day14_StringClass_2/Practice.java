package day14_StringClass_2;

public class Practice {
    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";
        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);

        if (result) {


            System.out.println("Logged in");
        }
        System.out.println("=======================================");
        /*

        valid password MUSt contain a special characters such (!,_$)
        valid passsword should not contain spaces
         */
        String Password = "mmasd 1235";
        if (Password.contains(" ")) {
            System.out.println("Password cannot have space in it");

        } else {
            System.out.println("valid Password");

            System.out.println("======================");
        }
        // startsWith(str)

        String s3 = "United States";

        System.out.println(s3.startsWith("U")); //true

        System.out.println("=============================================");

        String webAdress = "www.amazon.com";
        //false
        if (webAdress.startsWith("www."))
            System.out.println("valid");


        System.out.println("==================");

        /*
        every single gmail adress end with @gmail.com
         */
        String email ="CybertekSchool@yahoo.com";
        if(email.endsWith("@gmail.com")) {
        }
        System.out.println("Invalid gmail");











    }
}
