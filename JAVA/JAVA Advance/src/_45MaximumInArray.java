
package swclass;

import java.util.Scanner;

public class _45MaximumInArray {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,max;
        int[] array=new int [20];
        System.out.printf("How many number : ");
        n=Rahat.nextInt();
        System.out.printf("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            array[i]=Rahat.nextInt();
        }
        max=array[0];
        for (int i = 1; i < n; i++) {
            if(max<array[i])
                max=array[i];
        }
        System.out.printf("Maximum Value is %d  \n",max);
    }
}
