package learn.school.module_2.string;

public class Substring {

    public static int countOccurrences(String text, String pattern) {
        if (text == null || text.isEmpty() || pattern == null || pattern.isEmpty()) {
            return 0;
        }

        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = text.indexOf(pattern, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += pattern.length(); // Переходим к следующей позиции после найденной подстроки
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "This is a test string. This string contains the word string twice.";
        String pattern = "string";

        int occurrences = countOccurrences(text, pattern);
        System.out.println("The string '" + pattern + "' occurs " + occurrences + " times in the text.");

        text = "aaaaa";
        pattern = "aa";
        occurrences = countOccurrences(text, pattern);
        System.out.println("The string '" + pattern + "' occurs " + occurrences + " times in the text '" + text + "'."); // Expected: 2 (overlapping is counted)

        text = null;
        pattern = "abc";
        occurrences = countOccurrences(text, pattern);
        System.out.println("The string '" + pattern + "' occurs " + occurrences + " times in the text (null)."); // Expected: 0

        text = "abc";
        pattern = null;
        occurrences = countOccurrences(text, pattern);
        System.out.println("The string (null) occurs " + occurrences + " times in the text."); // Expected: 0

    }
}
