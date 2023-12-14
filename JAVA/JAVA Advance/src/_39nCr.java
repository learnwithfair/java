
package swclass;

import java.util.Scanner;



public class _39nCr {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,r,ncr=1,fact=1,x,npr=1;
        System.out.printf("Enter Value of n : ");
        n=Rahat.nextInt();
        
        System.out.printf("Enter Value of r : ");
        r=Rahat.nextInt();
         x=n;
        for (int i = 1; i <=r; i++) {
            npr=npr*n;
            n--;
        }
        for (int i = 1; i <=r; i++) {
            fact=fact*i;
        }
        ncr=npr/fact;
        System.out.printf("Value of %dC%d is : %d\n", x,r,ncr);
    }
}
