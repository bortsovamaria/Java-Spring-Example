package learn.school.module_2.string;

import java.util.HashMap;
import java.util.Map;

public class StringExample {

    public static void main(String[] args) {
//        workWithString();
        workWithStringPool();
//        workWithStringBuilder();
    }

    private static void workWithString() {

        String firstString = "Java";
        String secondString = firstString + " 17";

    }

    private static void workWithStringPool() {
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");

        System.out.println(str1 == str2); // 1
        System.out.println(str1 == str3); // 2

        String str4 = str3.intern();

        System.out.println(str4 == str1); // 3
    }

    private static void workWithStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        String result = sb.toString();

        System.out.println(result);
    }
}