class PalindromeChecker {
    private String text;

    // Initializing constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Create a method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Create a method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } 
		else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeString{

    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("cook");
        checker1.displayResult();

        PalindromeChecker checker2 = new PalindromeChecker("aabbaa");
        checker2.displayResult();
    }
}
