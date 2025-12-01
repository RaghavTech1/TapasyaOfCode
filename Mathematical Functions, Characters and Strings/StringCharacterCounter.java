import java.util.Scanner;

public class StringCharacterCounter {

    public static class Result {
        int vowels;
        int consonants;
        int digits;
        int spaces;
        int specialCharacters;
    }

    // Function to analyze the string
    public static Result analyzeString(String str) {
        Result result = new Result();

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {

            // Check for vowels
            if ("aeiou".indexOf(ch) != -1) {
                result.vowels++;
            }

            // Check for alphabets
            else if (ch >= 'a' && ch <= 'z') {
                result.consonants++;
            }

            // Digits
            else if (ch >= '0' && ch <= '9') {
                result.digits++;
            }

            // Spaces
            else if (ch == ' ') {
                result.spaces++;
            }

            // Everything else = special characters
            else {
                result.specialCharacters++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        //enter for the string
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = in.nextLine();

        Result r = analyzeString(input);

        System.out.println("Input String: " + input);
        System.out.println("Vowels: " + r.vowels);
        System.out.println("Consonants: " + r.consonants);
        System.out.println("Digits: " + r.digits);
        System.out.println("Spaces: " + r.spaces);
        System.out.println("Special Characters: " + r.specialCharacters);
        in.close();
    }
}
