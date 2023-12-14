package swclass;
import java.util.Scanner;
public class _51MultipliesTwoMatrix {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        int[][] A=new int [20][20];
     
        int[][] B=new int [20][20];
        int r1,r2,c1,c2,sum=0;
        System.out.printf("Enter A Matrix Row  : ");
        r1=Rahat.nextInt();
        
        System.out.printf("\nEnter A Matrix Column  : ");
        c1=Rahat.nextInt();
        System.out.printf("\nEnter Elements : \n");
        for (int i = 0; i <r1; i++) {
            for (int j = 0; j <c1; j++) {
               System.out.printf("A[%d][%d]  : ",i,j);
             A[i][j]=Rahat.nextInt();
            }
        }
        
        System.out.printf("Enter B Matrix Row  : ");
        r2=Rahat.nextInt();
        
        
        
        while(c1!=r2)
        {
            System.out.printf("Please Enter A Matrix Column & B Matrix Row Same Number \n");
            System.out.printf("\nEnter B Matrix Row  : ");
        r2=Rahat.nextInt();
        }
        System.out.printf("\nEnter B Matrix Column  : ");
        c2=Rahat.nextInt();
        System.out.printf("\nEnter Elements : \n");
        for (int i = 0; i <r2; i++) {
            for (int j = 0; j <c2; j++) {
                System.out.printf("B[%d][%d]  : ",i,j);
             B[i][j]=Rahat.nextInt();
            }
        }
        System.out.printf("\nA Matrix : \n");
        for (int i = 0; i <r1; i++) {
            for (int j = 0; j <c1; j++) {
                System.out.printf("%d ",A[i][j]);
            }
            System.out.println();
        }
       
        System.out.printf("\nB Matrix : \n");
        for (int i = 0; i <r2; i++) {
            for (int j = 0; j <c2; j++) {
                System.out.printf("%d ",B[i][j]);
            }
            System.out.println();
        }
       
        
        System.out.printf("\nA * B : \n");
        for (int i = 0; i <r1; i++) {
            for (int j = 0; j <c2; j++) {
               
                for (int k = 0; k <r2; k++) {
                     sum=sum+A[i][k]*B[k][j];
                }
                System.out.printf("%d ",sum);
                sum=0;
        
            }
            System.out.println();
        }
       
    }
}
