package Loops;

import java.util.Scanner;

public class PowerofN {
    public static void main(String[] args) {
        int n, pow, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();

        System.out.print("Enter the power of the number: ");
        pow = sc.nextInt();
        num = n;

        for(int i=1;i<pow;i++){
            num = num * n;
        }
        sc.close();
        System.out.println(num);
    }
}
