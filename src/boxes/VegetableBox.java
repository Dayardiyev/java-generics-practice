package boxes;

import vegetables.Vegetable;

public class VegetableBox<K,T extends Vegetable> {
    private K key;
    private T obj;

    public VegetableBox(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public K getKey() {
        return key;
    }

    public T getObj() {
        return obj;
    }
}
