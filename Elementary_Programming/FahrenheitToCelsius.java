package Elementary_Programming;

import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value in Fahrenheit ");
        double fahrenheit = input.nextDouble();

        //Convert Fahrenheit to Celsius
        double Celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + Celsius + " in celsius.");

        input.close();
    }
    
}