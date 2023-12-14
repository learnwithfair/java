
package swclass;

import java.util.Scanner;


public class _32ReverseNumber {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int num,rem;
        System.out.printf("Enter any number  : ");
        num=Rahat.nextInt();
        System.out.printf("Reverse Value is : ");
        while(num!=0)
        {
            rem=num%10;
            System.out.printf("%d",rem);
            num=num/10;
        }
        System.out.println();
    }
}
