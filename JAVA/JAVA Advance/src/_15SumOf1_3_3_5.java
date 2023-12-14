
package swclass;

import java.util.Scanner;

public class _15SumOf1_3_3_5 {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,k=1,j=3,sum=0,r=0;
        System.out.printf("How many Term : ");
        n=Rahat.nextInt();
        System.out.printf("Sum of the term :  ");
        for (int i = 0; i < n; i++) {
            r++;
            
            sum=sum+k*j;
            if (r==n) {
                System.out.printf(" %d*%d ",k,j);
            }
            else 
                  System.out.printf(" %d*%d + ",k,j);
            k+=2;
            j+=2;
        }
        System.out.println(" = " +sum );
    }
}
