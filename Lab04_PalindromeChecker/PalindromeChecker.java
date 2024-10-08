// File: PalindromeChecker.java
// Description: Check if the string input is a palindrome.
// Assignment Number: 4
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj. Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class PalindromeChecker {

    public static void main(String[] args) {
        String input = "R O T A S O P E R A T E N E T A R E P O S A T O R";
        MyCharStack st = new MyCharStack(input.length());
        for (int i = 0; i < input.length(); i++) {
            st.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != st.pop()) {
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
