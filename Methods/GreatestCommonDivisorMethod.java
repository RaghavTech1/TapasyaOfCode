package Methods;

import java.util.*;
public class GreatestCommonDivisorMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompt user to enter 2 integers
        System.out.print("Enter first Integer ");
        int n1 = sc.nextInt();
        System.out.print("Enter Second Integer ");
        int n2 = sc.nextInt();

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1,n2));
        sc.close();
    }

    /*return the gcd for two integers */
    public static int gcd(int n1, int n2) {
        int gcd = 1;    //initial gcd is 1
        int k = 2;      // possible gcd

        while(k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0) gcd = k;
            k++;
        }

        return gcd;
    }
}
