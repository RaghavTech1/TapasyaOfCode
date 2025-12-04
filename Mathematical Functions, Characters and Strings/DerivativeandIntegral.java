import java.util.Scanner;

public class DerivativeandIntegral {

    // Function to compute derivative of ax^2 + bx + c
    // derivative: f'(x) = 2ax + b
    public static String derivative(int a, int b, int c) {
        int A = 2 * a;
        int B = b;

        return A + "x + " + B;
    }

    // Function to compute indefinite integral of ax^2 + bx + c
    // integral: ∫(ax^2 + bx + c) dx = (a/3)x^3 + (b/2)x^2 + cx + K
    public static String integral(int a, int b, int c) {

        double A = a / 3.0;
        double B = b / 2.0;
        double C = c;

        return A + "x^3 + " + B + "x^2 + " + C + "x + K";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Compute derivative and integral of a polynomial:");
        System.out.println("Polynomial form: f(x) = ax^2 + bx + c");

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Derivative f'(x) = " + derivative(a, b, c));
        System.out.println("Integral ∫f(x) dx = " + integral(a, b, c));

        sc.close();
    }
}
