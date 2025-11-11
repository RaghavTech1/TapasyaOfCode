package Elementary_Programming;

public class DataType {
    public static void main(String[] args) {
        // ---------- PRIMITIVE DATA TYPES ----------

        // 1. byte → 8-bit integer, range: -128 to 127
        byte b = 100;
        System.out.println("byte b = " + b);

        // 2. short → 16-bit integer, range: -32,768 to 32,767
        short s = 30000;
        System.out.println("short s = " + s);

        // 3. int → 32-bit integer, range: -2^31 to 2^31-1
        int i = 123456;
        System.out.println("int i = " + i);

        // 4. long → 64-bit integer, used for large whole numbers
        long l = 9876543210L; // L is used to denote long literal
        System.out.println("long l = " + l);

        // 5. float → 32-bit decimal number, used for fractional values (single precision)
        float f = 3.14f; // f is used to denote float literal
        System.out.println("float f = " + f);

        // 6. double → 64-bit decimal number (double precision)
        double d = 3.141592653589793;
        System.out.println("double d = " + d);

        // 7. char → 16-bit Unicode character, enclosed in single quotes
        char c = 'A';
        System.out.println("char c = " + c);

        // 8. boolean → stores true or false values
        boolean isJavaFun = true;
        System.out.println("boolean isJavaFun = " + isJavaFun);


        // ---------- NON-PRIMITIVE (REFERENCE) DATA TYPES ----------

        // 1. String → sequence of characters, used for text
        String str = "Hello, Java!";
        System.out.println("String str = " + str);

        // 2. Arrays → collection of similar type elements, fixed size
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("int[] arr = ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. Wrapper Classes → provide object representations of primitive types
        Integer intObj = 10;        // Wrapper for int
        Double doubleObj = 5.5;     // Wrapper for double
        Boolean boolObj = false;    // Wrapper for boolean
        System.out.println("Wrapper Integer intObj = " + intObj);
        System.out.println("Wrapper Double doubleObj = " + doubleObj);
        System.out.println("Wrapper Boolean boolObj = " + boolObj);

        // 4. Object → base class for all Java classes
        Object obj = "This is an Object type";
        System.out.println("Object obj = " + obj);

        // 5. Enum → user-defined type with fixed set of constants
        Day today = Day.MONDAY;
        System.out.println("Enum Day today = " + today);

        // 6. null reference → indicates no object is assigned
        String empty = null;
        System.out.println("String empty = " + empty);
    }

    // Example of Enum type
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
}