
package swclass;

import java.util.Scanner;


public class _37LCMnumber {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int num2,num3,red,x,y,LCM,GCD;
        System.out.printf("Enter First Number  : ");
        num2=Rahat.nextInt();
        System.out.printf("Enter Second Number  : ");
        num3=Rahat.nextInt();
        x=num2;
        y=num3;
        while(num3!=0)
        {
            red=num2%num3;
             num2=num3;
             num3=red;
        }
        GCD=num2;
        LCM=x*y/(GCD);
        System.out.println("Value of GCD is " + GCD);
        System.out.println("Value of LCM is " + LCM);
    }
}
