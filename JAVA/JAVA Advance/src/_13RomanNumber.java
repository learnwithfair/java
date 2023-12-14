
package swclass;

import java.util.Scanner;


public class _13RomanNumber 
{
    public static void main(String[] args) 
    {
        Scanner Rahat = new Scanner(System.in);
        int num;
        System.out.print("Enter any number : ");
        num=Rahat.nextInt();
        System.out.print("Roman Number is : ");
       while(num!=0)
       {
            if(num>=1000)
        {
            System.out.print("m");
            num-=1000;
        }
        
        else if(num>=900)
        {
            System.out.print("cm");
            num-=900;
        }
        
        else if(num>=500)
        {
            System.out.print("d");
            num-=500;
        }
        
        else if(num>=400)
        {
            System.out.print("m");
            num-=400;
        }
        
        else if(num>=100)
        {
            System.out.print("c");
            num-=100;
        }
        
        else if(num>=90)
        {
            System.out.print("xc");
            num-=90;
        }
        
        else if(num>=50)
        {
            System.out.print("l");
            num-=50;
        }
        
        else if(num>=40)
        {
            System.out.print("xl");
            num-=40;
        }
        
        else  if(num>=10)
        {
            System.out.print("x");
            num-=10;
        }
        
        
        else  if(num>=9)
        {
            System.out.print("ix");
            num-=9;
        }
        
        else  if(num>=5)
        {
            System.out.print("v");
            num-=5;
        }
        
        else  if(num>=4)
        {
            System.out.print("iv");
            num-=4;
        }
        
        else  if(num>=1)
        {
            System.out.print("i");
            num-=1;
        }
       }
        System.out.println();
        
    }
}
