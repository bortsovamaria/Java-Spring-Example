package learn.school.module_2.generics.tasks;

import java.util.List;

public class BoundedBox <T extends Number> {

    private final List<T> numbers;

    public BoundedBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public double sum(List<? extends T> numbers) {
        return numbers.stream()
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        BoundedBox<Integer> box = new BoundedBox<>(integers);
        double sum = box.sum(integers);
        System.out.println(sum);
    }
}
