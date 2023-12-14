
package swclass;

import java.util.Scanner;

public class _44Average {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int n,sum=0;
        double avg;
        System.out.printf("How many number  : ");
        n=Rahat.nextInt();
        int[] array=new int[20];
        System.out.printf("Enter Elements : ");
        for (int i = 0; i <n; i++) {
            array[i]=Rahat.nextInt();
        }
        for (int i = 0; i <n; i++) {
            sum=sum+array[i];
        }
        avg=(double)sum/n;
        System.out.printf("Average Value is  %.2f \n",avg);
    }
}
