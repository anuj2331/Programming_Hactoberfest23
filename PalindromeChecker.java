import java.util.Scanner;

class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        
        // Normalize the string: lower case and filter non-alphanumeric characters
        String normalized = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Check for palindrome
        boolean isPalindrome = true;
        int length = normalized.length();
        for (int i = 0; i < length / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        
        // Output result
        if (isPalindrome) {
            System.out.println('"' + s + "\" is a palindrome string.");
        } else {
            System.out.println('"' + s + "\" is not a palindrome string.");
        }
    }
}
