package swclass;

import java.util.Scanner;

public class _53StringReverse {
    public static void main(String[] args) {
        Scanner Rahat = new Scanner(System.in);
        char[]  str={'R','a','h','a','t','u','l',' ','I','s','l','a','m'};
        char[]  str2={'R','a','h','a','t','u','l',' ','I','s','l','a','m'};
        //System.out.printf("Enter any String : ");
        //str=Rahat.nextLine();
        int len=str.length;
        for (int i = 0,j=len-1; i < len; i++,j--) {
            str2[i]=str[j];
        }
        System.out.printf("String is  : ");
        for (char c : str) {
            System.out.printf("%c",c);
        }
        System.out.printf("\nAfter Reverse String : ");
        for (int i = 0; i < len; i++) {
            System.out.printf("%c",str2[i]);
        }
        System.out.println();
       
    }
   
}
