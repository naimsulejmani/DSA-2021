package cacttus.education.dsa.Java_10_hashtables;


import java.util.LinkedList;

//separate chaining - LinkedList
public class HashTable<T> {
    //sa eshte hash tabela e madhe
    private final int MAX_ELEMENT = 20;
    private LinkedList<T>[] hashTable = new LinkedList[MAX_ELEMENT];

    public void put(T value) {
        int hashIndex = hashFunction(value);

        if (hashTable[hashIndex] == null)
            hashTable[hashIndex] = new LinkedList<>();

        hashTable[hashIndex].add(value);
    }



    private int hashFunction(T value) {
        return Math.abs(value.hashCode() & 0x7fffffff) % MAX_ELEMENT;
    }
}
