
package swclass;

import java.util.Scanner;


public class _14SumOf1357 {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,sum=0,k=1,r=0;
        System.out.printf("How many term : ");
        n=Rahat.nextInt();
       
        for (int i = 0; i < n; i++) {
            r++;
             sum=sum+k;
             if(n==r)
             System.out.print(k+" ");
             else 
             System.out.print(k+" + ");
            k+=2;
        }
        System.out.println(" = "+sum);

    }
}
