package learn.school.module_2.string;

public class Palindrome {

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit((s.charAt(i)))) {
                sb.append(s.charAt(i));
            }
        }

        int p1 = 0;
        int p2 = sb.toString().length() - 1;
        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                return false;
            }
            p1++; p2--;
        }
        return true;
    }

    public static boolean isPalindromeSecond(String str) {
        String processedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(processedStr).reverse().toString();
        return processedStr.equals(reversedStr);
    }

}
