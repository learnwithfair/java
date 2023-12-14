
package swclass;

import java.util.Scanner;

public class _3CircleArea {
    public static void main(String[] args) {
        Scanner rahat=new Scanner(System.in);
        double r,area;
        System.out.print("Enter any Redius : ");
        r=rahat.nextDouble();
        area=Math.PI*r*r;
        System.out.printf("Area of a Circle is %.3f\n",area);
    }
}
