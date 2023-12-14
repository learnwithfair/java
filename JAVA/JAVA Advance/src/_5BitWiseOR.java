
package swclass;

import java.util.Scanner;

public class _5BitWiseOR {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
         int num1, num2;
        System.out.print("Enter First number : ");
        num1=Rahat.nextInt();
        System.out.print("Enter Second number : ");
        num2=Rahat.nextInt();
        System.out.printf("Bit Wise value is %d\n",num1|num2);
    }
}
