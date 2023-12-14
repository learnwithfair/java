
package swclass;

import java.util.Scanner;

public class _46InsertInArray {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,pos;
        System.out.printf("How many numbers  : ");
        n=Rahat.nextInt();
        int[] arra=new int[20];
        System.out.printf("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            arra[i]=Rahat.nextInt();
        }
        System.out.printf("Array list : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("  %d",arra[i]);
        }
        System.out.printf("\nEnter position : ");
        pos=Rahat.nextInt();
        System.out.printf("\nEnter any number  : ");
        int num = Rahat.nextInt();
        for (int i = 0; i < n; i++) {
            if(i+1==pos)
                arra[i]=num;
                }
        System.out.printf("\nAfter Insert number in Array list : ");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d",arra[i]);
        }
        System.out.println();
    }
}
