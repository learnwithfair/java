package swclass;
import java.util.Scanner;
public class _52AddMultipleMatrix {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int[][] A=new int[20][20];
        System.out.printf("\nEnter A Matrix Row Number : ");
        int r1=Rahat.nextInt();
        
        System.out.printf("\nEnter A Matrix Column Number : ");
        int c1=Rahat.nextInt();
        System.out.printf("\nEnter Elements : \n");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("A[%d][%d]  : ",i,j);
                A[i][j]=Rahat.nextInt();
            }
        }
        
        //B Matrix
        int[][] B=new int[20][20];
        System.out.printf("\nEnter B Matrix Row Number : ");
        int r2=Rahat.nextInt();
        
        System.out.printf("\nEnter B Matrix Column Number : ");
        int c2=Rahat.nextInt();
        System.out.printf("\nEnter Elements : \n");
        for (int row = 0; row < r2; row++) {
            for (int col = 0; col < c2; col++) {
                System.out.printf("B[%d][%d]  : ",row,col);
                B[row][col]=Rahat.nextInt();
            }
        }
        //A Matrix
        System.out.printf("\nA Matrix  : \n");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.printf("%d ",A[i][j]);
            }
            System.out.println();
        }
        //B Matrix
        System.out.printf("\nB Matrix  : \n");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.printf("%d ",B[i][j]);
            }
            System.out.println();
        }
        
        System.out.printf("\nA + B  Matrix  : \n");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
               int  sum=A[i][j]+B[i][j];
                System.out.printf("%d ",sum);
            }
            System.out.println();
        }
        
        
        int sum=0;
        System.out.printf("\nA * B  Matrix  : \n");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < r2; k++) {
                     sum=sum+A[i][k]*B[k][j];
                }
              
                System.out.printf("%d ",sum);
                sum=0;
            }
            System.out.println();
        }
    }
}
