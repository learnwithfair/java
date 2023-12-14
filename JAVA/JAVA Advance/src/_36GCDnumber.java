
package swclass;

import java.util.Scanner;


public class _36GCDnumber {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int num2,num3,red;
        System.out.printf("Enter First Number  : ");
        num2=Rahat.nextInt();
        System.out.printf("Enter Second Number  : ");
        num3=Rahat.nextInt();
        while(num3!=0)
        {
            red=num2%num3;
             num2=num3;
             num3=red;
        }
        System.out.println("GCD = " + num2);
    }
}
