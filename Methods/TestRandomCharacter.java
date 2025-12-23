package Methods;

// No import needed for RandomGenerator if not used

public class TestRandomCharacter {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        // print random characters between 'a' and 'z' , 25 chars per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            // Call the static method from the companion class below
            char ch = RandomCharacter.getRandomLowerCaseLetters(); 
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch); // Print with a new line
            } else {
                System.out.print(ch); // Print without a new line
            }
        }
    }
}

/**
 * A companion class that provides methods for generating random characters.
 * This should ideally be in a separate file named RandomCharacter.java
 * within the 'Methods' package.
 */
class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        // Generates a random number that is cast to a char.
        // It uses Math.random() which returns a double between 0.0 and 1.0 (exclusive of 1.0)
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetters() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random uppercase letter */
    public static char getRandomUpperCaseLetters() {
        return getRandomCharacter('A', 'Z');
    }

    /** Generate a random digit character */
    public static char getRandomDigitCharacters() {
        return getRandomCharacter('0', '9');
    }

    /** Generate a random character */
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uffff');
    }
}