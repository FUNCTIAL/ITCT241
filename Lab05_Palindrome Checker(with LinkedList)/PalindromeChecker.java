// File: PalindromeChecker.java
// Description: Check if the string input is a palindrome.
// Assignment Number: 5
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj. Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "TENET";

        MyLinkListStack a = new MyLinkListStack();
        for (int i = 0; i < input.length(); i++) {
            a.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != a.pop()) {
                System.out.println(
                    "The string " + input + " is not a palindrome."
                );
                break;
            }

            if (i == (input.length() - 1)) {
                System.out.println("The string " + input + " is a palindrome.");
            }
        }
    }
}
