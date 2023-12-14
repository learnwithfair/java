
package swclass;

import java.util.Scanner;


public class _4FahrenheitTemperature {
    public static void main(String[] args) {
        Scanner rahat=new Scanner(System.in);
       int c;
       double f;
        System.out.print("Enter Celcius Temperature : ");
       c=rahat.nextInt();
       f=((9*c)/5)+32;
        System.out.printf("Fahrenheit Temperature is %.3f\n",f);
    }
}
//c/5=f-32/9