
package swclass;

import java.util.Scanner;

public class _8Grade
{
    public static void main(String[] args) 
    {
        Scanner Rahat = new Scanner(System.in);
        int mark;
        System.out.printf("Enter any mark : ");
        mark=Rahat.nextInt();
        if(mark>100||mark<0)
        {
            System.out.println("Invalied Result " );
        }
        else if(mark>=80)
            System.out.println("A+");
        
        else if(mark>=70)
            System.out.println("A");
        
        else if(mark>=60)
            System.out.println("A-");
        
        else if(mark>=50)
            System.out.println("B");
        
        else if(mark>=40)
            System.out.println("C");
        
        else if(mark>=33)
            System.out.println("D");
        else
            System.out.println("Fail");
        
    }
}
