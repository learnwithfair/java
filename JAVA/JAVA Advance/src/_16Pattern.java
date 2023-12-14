
package swclass;

import java.util.Scanner;


public class _16Pattern {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,k=0;
        System.out.printf("How many Term : ");
        n=Rahat.nextInt();
        for (int row = 1; row <=n; row++) {
            for (int col = n; col >=row; col--) {
                k++;
                if(k%2==0)
                System.out.printf(" 1");
                else 
                System.out.printf(" 0");
            }
            System.out.println();
            
        }
    }
}
