import java.util.Scanner;

public class WordCounter {

    // Function to count words in a string
    public static int countWords(String str) {

        // Trim removes leading/trailing spaces
        str = str.trim();

        // If string becomes empty after trimming → zero words
        if (str.isEmpty()) {
            return 0;
        }

        // Split by one or more spaces using regex
        String[] words = str.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        int wordCount = countWords(input);

        System.out.println("Total number of words: " + wordCount);

        sc.close();
    }
}
