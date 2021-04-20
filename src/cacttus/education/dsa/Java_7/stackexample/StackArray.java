package cacttus.education.dsa.Java_7.stackexample;

import java.util.ArrayList;

public class StackArray<T> {
    private static final int MAX_SIZE = 100;
    private int size = 0;

    ArrayList<T> list = new ArrayList<>();

    public void push(T data) throws StackOverflowException {
        if (size == MAX_SIZE) {
            throw  new StackOverflowException();
        }
        //list.add(0,data);
        list.add(data);
        size++;
        //kjo ehte eleneti
    }
}
