package datastructs.hashmaps;

import java.util.HashMap;

public class MyHashMap {
    /*put(key, value): Inserts the specified key-value pair into the HashMap.
get(key): Retrieves the value associated with the specified key.
containsKey(key): Checks if the HashMap contains the specified key.
containsValue(value): Checks if the HashMap contains the specified value.
remove(key): Removes the key-value pair associated with the specified key from the HashMap.
size(): Returns the number of key-value pairs in the HashMap.
isEmpty(): Checks if the HashMap is empty.
keySet(): Returns a Set containing all the keys in the HashMap.
values(): Returns a Collection containing all the values in the HashMap.
clear(): Removes all the key-value pairs from the HashMap. */

    private HashMap<String, Integer> hashMap;

    public MyHashMap() {
        this.hashMap = new HashMap<>();
    }

    public void populateHashMap() {
        hashMap.put("John",25);
        hashMap.put("Alice",30);
        hashMap.put("Bob",35);
        hashMap.put("Luke",35);
    }

    public void displayKeyValuePairs() {
        for (String key: hashMap.keySet()) {
            System.out.println(key + " is " + hashMap.get(key) + " old.");
        }
    }

    public void displayAllKeys() {
        System.out.println("HashMap keys:");
        for (String key: hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public void displayAllValues() {
        System.out.println("HashMap values:");
        for (Integer value: hashMap.values()) {
            System.out.println(value);
        }
    }

    public void removeKeyValuePair() {
        hashMap.remove("Bob");
    }

    public boolean hasBob() {
        return hashMap.containsKey("Bob");
    }

    public boolean hasValue(int value) {
        return hashMap.containsValue(value);
    }

    public void emptyHashMap() {
        hashMap.clear();
    }

    public static void main(String[] args) {
        MyHashMap hash = new MyHashMap();
        int value = 23;
        hash.populateHashMap();
        hash.displayKeyValuePairs();
        hash.displayAllKeys();
        hash.displayAllValues();
        boolean gotValue = hash.hasValue(value); //has to be false
        System.out.println(gotValue);
        hash.removeKeyValuePair();
        System.out.println("Map after removing one of the ke-value pairs");
        hash.displayKeyValuePairs();
        hash.emptyHashMap();

    }
}
