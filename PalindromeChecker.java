public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        String original = Integer.toString(number);
        return original.equals(new StringBuilder(original).reverse().toString());
    }

    public static void main(String[] args) {
        int number = 45687;
        System.out.println(number + (isPalindrome(number) ? " is a palindrome." : " is not a palindrome."));
    }
}
