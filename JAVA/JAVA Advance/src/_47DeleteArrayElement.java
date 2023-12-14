
package swclass;

import java.util.Scanner;


public class _47DeleteArrayElement {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        System.out.printf("How many numbers : ");
        int n=Rahat.nextInt();
        int[] array=new int [20];
        System.out.printf("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            array[i]=Rahat.nextInt();
        }
        System.out.printf("Array list : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("  %d",array[i]);
        }
        System.out.printf("\nEnter  Position for Delete Number: ");
        int pos=Rahat.nextInt();
        System.out.printf("\nAfter Delete Number in Array List : ");
        for (int i = 0; i < n; i++) {
            if(i+1==pos)
            {
                continue;
            }
            System.out.printf(" %d",array[i]);
        }
        System.out.println();
    }
}
