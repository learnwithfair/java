
package swclass;

import java.util.Scanner;

public class _7Division {
    public static void main(String[] args) {
        
            Scanner R=new Scanner(System.in);
        int mark;
        System.out.print("Enter any Mark : ");
        mark=R.nextInt();
        if(mark>100)
        {
            System.out.println("Invaliet Result");
        }
        else if(mark>=60)
        {
            System.out.println("First Division\n");
        }
        else if(mark>=48)
        {
            System.out.println("Second Division\n");
        }
        else if(mark>=33)
        {
            System.out.println("Third Division\n");
        }
        else if(mark<33)
        {
            System.out.println("Fail\n");
        }
        
    }
}
