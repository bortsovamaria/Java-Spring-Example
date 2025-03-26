package learn.school.module_3.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> {
            System.out.println("Task executed by thread pool");
        });
        executor.shutdown();
    }

}
