package learn.school.module_3.multithreading;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {

    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("key", 1);

        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("element");
    }
}
