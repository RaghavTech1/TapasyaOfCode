package Elementary_Programming;

import java.util.Scanner;    //Scanner in java util package

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {

        //Create a scanner object
        Scanner input = new Scanner(System.in);


        //Prompt a user to enter radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        //compute area
        double area = radius * radius * 3.14;

        //Display result
        System.out.println("The area of the circle is " + area);
        input.close();
    }
}
