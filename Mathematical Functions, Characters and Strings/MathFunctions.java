public class MathFunctions {

    // ---------------- BASIC ARITHMETIC ----------------

    // Add two numbers
    public static int add(int a, int b) {
        return a + b;  // simple addition
    }

    // Subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;  // simple subtraction
    }

    // Multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;  // simple multiplication
    }

    // Divide two numbers safely
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        int ans1 = add(10, 20);
        int ans2 = subtract(30, 10);
        int ans3 = multiply(10, 10);
        double ans4 = divide(10, 8);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
    
}