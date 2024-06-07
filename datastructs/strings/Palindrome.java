package datastructs.strings;

public class Palindrome {

    private boolean isPalindrome(String word) {
        
        word = word.toLowerCase();
        int wordLength = word.length();
        
        if (wordLength == 0 || wordLength == 1) {
            return true;
        }

        char startChar = word.charAt(0);
        char endChar = word.charAt(wordLength - 1);
    
        if (startChar == endChar) {
            return isPalindrome(word.substring(1, wordLength - 1));
        }

        return false;
    }
    public static void main(String[] args) {
        String word = "pullup";
        Palindrome palindrome = new Palindrome();
        
        System.err.println(palindrome.isPalindrome(word));
    }
}
