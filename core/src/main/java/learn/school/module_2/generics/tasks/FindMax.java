package learn.school.module_2.generics.tasks;

import java.util.ArrayList;
import java.util.List;

public class FindMax {

    public static <T extends Comparable<T>> T findMax(List<T> list) {
        return list.stream()
                .max(Comparable::compareTo)
                .orElse(null);
    }
}

class Main1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("1");
        list.add("10");
        list.add("0");
        String result = FindMax.findMax(list);
        System.out.println(result);
    }
}
