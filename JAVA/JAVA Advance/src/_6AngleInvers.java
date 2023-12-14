
package swclass;

import java.util.Scanner;

public class _6AngleInvers {
    public static void main(String[] args) {
        Scanner rahat=new Scanner(System.in);
        double num,r;
        System.out.print("Enter any angle : ");
        num=rahat.nextInt();
        r= ( Math.asin(num)*(180/Math.PI));
        System.out.printf("Inverse angle is %.2f\n",r);
    }
}
