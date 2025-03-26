package learn.school.module_3.func_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FuncExample {

    public static void main(String[] args) {
        // 1 examples
        Predicate<Integer> isPositive = x -> x > 0;
        Consumer<String> print = (x) -> System.out.println(x);
        Function<String, Integer> length = (s) -> s.length();
        Supplier<Double> random = () -> Math.random();


        //2
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;

        System.out.println(add.calculate(5, 3)); // 8
        System.out.println(multiply.calculate(5, 3)); // 15
    }
}
