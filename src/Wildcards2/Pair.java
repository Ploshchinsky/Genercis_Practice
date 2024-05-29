package Wildcards2;

public class Pair<K, V> {
    private K key;
    private V value;

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

    public void setKey(K newKey) {
        this.key = newKey;
    }

    public void setValue(V newValue) {
        value = newValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static Number getSumFromPair(Pair<? extends Number, ? extends Number> pair) {
        Number keyNumber = pair.getKey();
        Number valueNumber = pair.getValue();
        return keyNumber.doubleValue() + valueNumber.doubleValue();
    }
}
