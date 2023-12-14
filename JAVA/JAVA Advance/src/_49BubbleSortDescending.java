
package swclass;

import java.util.Scanner;


public class _49BubbleSortDescending {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int[] array = new int [20];
        System.out.printf("How many number  : ");
        int n=Rahat.nextInt();
        System.out.printf("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            array[i]=Rahat.nextInt();
        }
        System.out.printf("Array List : ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ",array[i]);
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 1+i; j <n; j++) {
                if(array[i]<array[j])
                {
                    int tem=array[i];
                    array[i]=array[j];
                    array[j]=tem;
                }
            }
        }
        System.out.printf("\nDescending Order : ");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d",array[i]);
        }
        System.out.println();
    }
}
