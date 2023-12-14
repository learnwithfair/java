
package swclass;

import java.util.Scanner;

public class _41PrimeNumber1toN {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,i,j;
        System.out.printf("How many term : ");
        n=Rahat.nextInt();
        System.out.printf("Prime numbers are : ");
        for ( i = 1; i <=n; i++) 
        {
            for(j=2;j<=i;j++)
                        {
                      if(i%j==0)
                       break;
                        }
             if(i==j)
            System.out.printf("%d ",i);
        }
        System.out.println();
       
    }
}
