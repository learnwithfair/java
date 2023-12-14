
package swclass;

import java.util.Scanner;


public class _29Pattern {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,k=0;
        System.out.printf("How many  term  : ");
        n=Rahat.nextInt();
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.printf("  ");
            }
            for (int col = 1; col <= row; col++) {
                k++;
                if(k>9)
                    System.out.printf(" %d",k%10);
                else 
                System.out.printf(" %d",k);
            }
            
            for (int col = row-1; col>=1; col--) {
                k--;
                if(k>9)
                    System.out.printf(" %d",k%10);
                else 
                System.out.printf(" %d",k);
            }
            System.out.println();
            
        }
        //
        k=k-2;
        for (int row = n-1; row >=1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.printf("  ");
            }
            for (int col = 1; col <= row; col++) {
                k++;
                if(k>9)
                    System.out.printf(" %d",k%10);
                else 
                System.out.printf(" %d",k);
            }
            
            for (int col = row-1; col>=1; col--) {
                k--;
                if(k>9)
                    System.out.printf(" %d",k%10);
                else 
                System.out.printf(" %d",k);
            }
            System.out.println();
            k-=2;
        }
    }
}
