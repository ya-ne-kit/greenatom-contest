public class Main {
    public static void main(String[] args) {
        String s = "Str";
        if (isPalindrome("Str")) {
            System.out.printf("The entered string '%s' is a palindrome", s);
        } else {
            System.out.printf("The entered string '%s' is not a palindrome", s);
        }
    }

    public static boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
