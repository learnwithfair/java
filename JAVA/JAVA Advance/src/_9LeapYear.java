
package swclass;

import java.util.Scanner;


public class _9LeapYear
{
    public static void main(String[] args) 
    {
        Scanner Rahat = new Scanner(System.in);
        int num;
        System.out.printf("Enter any Year  : ");
        num=Rahat.nextInt();
        if((num%400==0)||(num%4==0&&num%100!=0))
            System.out.println("Leap Year");
        else 
            System.out.println("Not Leap Year");
    }
}
