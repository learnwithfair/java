
package swclass;

import java.util.Scanner;


public class _43FibonacciOrNot {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
         int num1=-1,num2=1,n,sum=0;
        System.out.printf("Enter any number  : ");
        n=Rahat.nextInt();
     
        for (int i = 0; i <=n; i++) {
            sum=num1+num2;
            if(sum==n)
                break;
            num1=num2;
            num2=sum;
        }
       if(sum==n)
            System.out.printf("This Number is Palindrome.\n");
       else
            System.out.printf("This Number is Not Palindrome.\n");
    }
}
