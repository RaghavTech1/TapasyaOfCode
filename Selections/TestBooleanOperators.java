import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        
        //recieve an input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if(number % 2 == 0 && number % 3 == 0){
            System.out.println(number + " is divisible by 2 and 3. ");
        }
        if(number % 2 == 0 || number % 3 == 0){
            System.out.println(number + " is divisible by 2 or 3. ");
        }
        if(number % 2 == 0 ^ number % 3 == 0){
            System.out.println(number + " is divisible by 2 or 3. But not by both. ");
        }
        input.close();
    }
    
}