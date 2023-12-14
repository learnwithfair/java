
package swclass;

import java.util.Scanner;

public class _10QuadraticEquation {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int a,b,c,r;
        double x1,x2;
        System.out.printf("Enter Value of a : ");
        a=Rahat.nextInt();
        
        System.out.printf("Enter Value of b : ");
        b=Rahat.nextInt();
        
        System.out.printf("Enter Value of c : ");
        c=Rahat.nextInt();
        r=b*b-4*a*c;
        if(r<0)
        {
            System.out.println("Imaginarry Number.");
        }
        else
        {
            x1=-b+Math.sqrt(r)/(2*a);
            x2=-b-Math.sqrt(r)/(2*a);
            System.out.printf("X = %.2f,%.2f\n",x1,x2);
        }
        
    }
}
