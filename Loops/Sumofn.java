package Loops;

import java.util.Scanner;

public class Sumofn {
    public static void main(String[] args) {
        int n , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of first n numbers are: " + sum);

        sc.close();
    }
}