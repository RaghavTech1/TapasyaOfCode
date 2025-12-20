package Loops;

import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int low = 0;

        int high = s.length()-1;

        boolean isPalindrome = true;
        while (low<high) {
            if(s.charAt(low) != s.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome) System.out.println(s + " is a Palindrome ");
        else System.out.println(s + " is not a Palindrome");

        sc.close();
    }
}
