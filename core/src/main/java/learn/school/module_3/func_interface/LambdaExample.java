package learn.school.module_3.func_interface;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.function.Predicate;

public class LambdaExample {

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        // 1
//        Readable read = new Readable() {
//            @Override
//            public int read(CharBuffer cb) throws IOException {
//                // logic
//                return 0;
//            }
//        };

        //2
        Readable read = cb -> {
            // logic
            return 0;
        };


    }

}
