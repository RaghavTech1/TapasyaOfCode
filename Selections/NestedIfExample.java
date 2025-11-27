import java.util.Scanner;
public class NestedIfExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Asking user to enter age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Asking user citizenship status
        System.out.print("Are you an Indian citizen? (yes/no): ");
        String citizen = input.next();

        // Outer IF checks if user is 18 or above
       if (age >= 18) {

            // Inner IF checks citizenship
            if (citizen.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to apply for a Driving License.");
            } else {
                System.out.println("You must be an Indian citizen to apply.");
            }

        } else {
            // This executes when age is below 18
            System.out.println("You must be at least 18 years old to apply for a Driving License.");
        }

        input.close();
    }
}