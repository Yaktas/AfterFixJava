package day10_SiwtchScanner;

public class DaysInMounth {
    /*
    write program that can find the number of days in month
    28 days :2
    30 days;4,6,9,11
    31 days: 1,3,5,7,8,10,12
     */
    public static void main(String[] args) {

        int num =11;
        boolean days28 = num ==2 ;
        boolean days30 = num== 4|| num ==6 || num==9 || num==11;

        String result ="";
        if(num>0 && num<13){
            result =(days28)? "This month is 28 days" : (days30)? "this mounth is 30 days" : "This Month is 30 days";

        }
        System.out.println(result);
    }
}
