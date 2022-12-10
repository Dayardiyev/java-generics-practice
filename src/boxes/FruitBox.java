package boxes;

import fruits.Fruit;

public class FruitBox<K,T extends Fruit> {
    private K key;
    private T obj;

    public FruitBox(K key, T obj) {
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
