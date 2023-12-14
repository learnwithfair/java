
package swclass;

import java.util.Scanner;


public class _38nPr {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,r,npr=1,x;
        System.out.printf("Enter Value of n : ");
        n=Rahat.nextInt();
        System.out.printf("Enter Value of r : ");
        r=Rahat.nextInt();
        x=n;
        for (int i = 1; i <=r; i++) {
            npr=npr*n;
            n--;
        }
        System.out.printf("Value of %dP%d is : %d\n",x,r,npr);
    }
}
