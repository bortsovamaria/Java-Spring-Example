package learn.school.module_3.multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        MyThread thread = new MyThread();
        thread.start();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}
