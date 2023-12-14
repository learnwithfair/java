
package swclass;

import java.util.Scanner;

public class _12MaximumThreeNumber {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int num1,num2,num3,max;
        System.out.printf("Enter First Number : ");
        num1=Rahat.nextInt();
        
        System.out.printf("Enter Second Number : ");
        num2=Rahat.nextInt();
        
        System.out.printf("Enter Third Number : ");
        num3=Rahat.nextInt();
        if(num1>num2&&num1>num3)
            System.out.printf("Maximum number is %d\n",num1);
        else if(num2>num1&&num2>num3)
            System.out.printf(" Maximum number is %d \n",num2);
        else
            System.out.println("Maximum number is   " + num3 );
    }
 
}
