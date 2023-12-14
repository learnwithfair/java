
package swclass;

import java.util.Scanner;


public class _48SearchInArray {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        System.out.printf("How many number : ");
        int n=Rahat.nextInt();
        int p=0,k=0;
        int[] pos=new int[20];
        int[] array=new int[20];
        System.out.printf("\nEnter Elements : ");
        for (int i = 0; i < n; i++) {
            array[i]=Rahat.nextInt();
            
        }
        System.out.printf("\nArray list : ");
        for (int i = 0; i < n; i++) {
            System.out.printf(" %d",array[i]);
        }
        System.out.printf("\nEnter Search Number : ");
        int num=Rahat.nextInt();
        for (int i = 0; i < n; i++) {
            p++;
            if(array[i]==num)
            {
                pos[k]=p;
                    k++;
            }
                
        }
        System.out.printf("\nThis Number is Found ");
        for (int i = 0; i < k; i++) {
            System.out.printf("%d,",pos[i]);
        }
        System.out.printf(" Number(s) Position in the array.\n");
        
    }
}


