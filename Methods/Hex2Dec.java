package Methods;
import java.util.*;

public class Hex2Dec {
    /** Main Method */
    public static void main(String[] args) {
        // Make a scnner
        Scanner sc = new Scanner(System.in);

        //prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = sc.nextLine();

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        sc.close();
    }
    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for(int i=0;i<hex.length();i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) {
        if(ch >= 'A' && ch <= 'F') return 10 + ch - 'A';
        else return ch - '0';
    }
        
}