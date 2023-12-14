
package swclass;

import java.util.Scanner;


public class _31Factorial {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,fact=1;
        System.out.printf("Enter any number  : ");
        n=Rahat.nextInt();
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial Value is  " + fact);
    }
}
