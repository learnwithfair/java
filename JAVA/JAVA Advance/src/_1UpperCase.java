
package swclass;

import java.util.Scanner;


public class _1UpperCase {
    public static void main(String[] args) {
       
      
        Scanner input=new Scanner(System.in);
        System.out.print("Enter any lower case : ");
        char ch;
        ch=input.next().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.printf("Upper Case Letter is %c\n",(ch-32));
        }
        else
        {
            System.out.printf("Upper Case Letter is %c\n",ch);
        }
       
    }
}
