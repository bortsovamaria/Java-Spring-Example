package learn.school.module_2.generics.tasks;

import java.util.ArrayList;
import java.util.List;

public class Copy {

    public static <T> void copy(List<? super T> dest, List<? extends T> src) {
        for (T el : src) {
            dest.add(el);
        }
    }

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        List<String> strings = List.of("1", "2", "3");
        Copy.copy(objects, strings);
        System.out.println(objects);

    }
}
