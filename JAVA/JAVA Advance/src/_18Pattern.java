
package swclass;

import java.util.Scanner;

public class _18Pattern {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n;
        System.out.printf("How many term  : ");
        n=Rahat.nextInt();
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=n-row; col++) {
                System.out.printf("   ");
                
            }
            for (int col = 1; col <=row; col++) {
                System.out.printf("  %d",col);
            }
            
        
        //
        for (int col = row-1; col >=1; col--) {
                System.out.printf("  %d",col);
        }
            System.out.println();
    }
        }
    
}
