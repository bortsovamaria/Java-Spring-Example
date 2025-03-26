package learn.school.module_3.multithreading;

import java.util.concurrent.locks.Lock;

public class ReentrantLock {

    synchronized void method() {
        // Критическая секция
    }

    volatile boolean flag = true;

    public static void main(String[] args) {

        Lock lock = new java.util.concurrent.locks.ReentrantLock();
        lock.lock();
        try {
            // Критическая секция
        } finally {
            lock.unlock();
        }

    }
}
