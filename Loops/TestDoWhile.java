package Loops;
import java.util.*;


public class TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        //create a scanner
        Scanner sc = new Scanner(System.in);

        // Keep reading data until the input is zero (0)
        do{
            // Read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = sc.nextInt();
            sum += data;
        } while(data != 0);
        sc.close();
        System.out.println("THe sum is: " + sum);
    }
}
