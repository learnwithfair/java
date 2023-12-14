
package swclass;

import java.util.Scanner;


public class _2Remainder 
{
    public static void main(String[] args) 
    {
        Scanner Rahat = new Scanner(System.in);
        int num1,num2,red;
        System.out.print("Enter First number : ");
        num1=Rahat.nextInt();
        System.out.print("Enter Second number : ");
        num2=Rahat.nextInt();
        red=num1%num2;
        System.out.printf("Remainder value is %d\n",red);
       
    }
}
