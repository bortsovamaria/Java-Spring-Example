package learn.school.module_3.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        Stream<String> stream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                })
                .map(name -> {
                    System.out.println("Mapping: " + name);
                    return name.toUpperCase();
                });

        // Никакие операции фильтрации и преобразования еще не выполнены!

        List<String> result = stream.collect(Collectors.toList()); // Терминальная операция вызывает выполнение всего конвейера
    }
}
