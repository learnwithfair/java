
package swclass;

import java.util.Scanner;

public class _11EvenOdd {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int num;
        System.out.printf("Enter any number : ");
        num=Rahat.nextInt();
        if(num%2==0)
            System.out.println("This number is Even");
        else
            System.out.println("This number is Odd");
    }
}
