
package swclass;

import java.util.Scanner;

public class _40PrimeNumber {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int num,i;
        System.out.printf("Enter any number  : ");
        num=Rahat.nextInt();
        for ( i = 2; i <=num; i++) {
            if(num%i==0)
                break;
            
        }
        
        if (num==i) {
            System.out.printf("This number is Prime Number  \n");
        }
        else
            System.out.printf("This number is not Prime Number .\n");
    }
 
}
