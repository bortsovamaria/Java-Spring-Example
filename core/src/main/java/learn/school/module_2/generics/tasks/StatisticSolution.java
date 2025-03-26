package learn.school.module_2.generics.tasks;

import java.util.ArrayList;
import java.util.List;

interface Statistic<T extends Number> {

    void addValue(T value);

    double average();
}

public class StatisticSolution implements Statistic<Integer> {

    private List<Integer> numbers = new ArrayList<>();

    @Override
    public void addValue(Integer value) {
            numbers.add(value);
    }

    @Override
    public double average() {
        return numbers.stream()
                .mapToDouble(Number::doubleValue)
                .average()
                .getAsDouble();
    }
}
