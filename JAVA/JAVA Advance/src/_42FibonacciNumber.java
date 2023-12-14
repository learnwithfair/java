
package swclass;

import java.util.Scanner;

public class _42FibonacciNumber {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int num1=-1,num2=1,n,sum;
        System.out.printf("How many term : ");
        n=Rahat.nextInt();
        System.out.printf("Palindrome Series is  : ");
        for (int i = 1; i <=n; i++) {
            sum=num1+num2;
            System.out.print(" " + sum);
            num1=num2;
            num2=sum;
        }
        System.out.println();
    }
}
