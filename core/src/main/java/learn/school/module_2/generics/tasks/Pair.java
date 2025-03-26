package learn.school.module_2.generics.tasks;

public class Pair<K, V> {

    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Main {
    public static void main(String[] args) {
        Pair<String, String> pair = new Pair<>("1", "value");
        System.out.println(pair.getKey());
    }
}
