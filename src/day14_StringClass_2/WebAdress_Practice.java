package day14_StringClass_2;
/*

       write a program that can validate if a web adress is valid
       valid web adress :

       MUST start with www
       Must ends with  .com, or .edu, .net, .Gov
        */
public class WebAdress_Practice {


    public static void main(String[] args) {


        String website = "www.cybertek.COM";
        website = website.toLowerCase();

        boolean validending = website.endsWith(".com") || website.endsWith(".edu")|| website.endsWith("gov");
        if( website.startsWith("www")&& validending) {

            System.out.println("Valid adress  "+ website);


        }else {
            System.out.println("Invalid adress"+ website);

        }


    }
}
