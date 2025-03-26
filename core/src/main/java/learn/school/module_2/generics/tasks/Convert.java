package learn.school.module_2.generics.tasks;

import java.util.List;
import java.util.function.Function;

public class Convert {

    public static void main(String[] args) {
        List<Integer> result = Convert.map(List.of("1", "2", "3"), strings -> mapStringsToIntegers(strings));

        System.out.println(result);
    }

    private static <T, E> List<E> map(List<T> input, Function<List<T>, List<E>> function) {
        return function.apply(input);
    }

    private static List<Integer> mapStringsToIntegers(List<String> strings) {
        return strings.stream()
                .map(Integer::valueOf)
                .toList();
    }

}
