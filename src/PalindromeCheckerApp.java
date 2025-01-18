import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the word or sentence to find out if it is a palindrome : ");
        String userInput = scan.nextLine().trim();
        scan.close();

        if (isPalindrom(userInput)) {
            System.out.println("The entered expression is a palindrome.");
        } else
            System.out.println("The entered expression is not a palindrome.");


    }

    public static boolean isPalindrom(String input) {
        String reverseSpelling = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseSpelling = reverseSpelling + input.charAt(i);
        }
        if (reverseSpelling.equalsIgnoreCase(input)) {
            return true;
        } else
            return false;

    }
}

