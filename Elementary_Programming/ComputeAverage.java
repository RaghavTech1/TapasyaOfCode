package Elementary_Programming;

import java.util.*;     //Scanner in java util package

public class ComputeAverage {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to enter three numbers
        System.out.print("Enter three numbers: ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //compute average
        double average = (number1 + number2 + number3) / 3;

        //display result
        System.out.println("The average of three numbers are: " + average);

        input.close();
    }
}
