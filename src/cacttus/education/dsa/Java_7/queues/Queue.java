package cacttus.education.dsa.Java_7.queues;

import java.lang.reflect.Array;

public class Queue<T> {
    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 7;
    private T[] elements;
    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;
    public Queue(Class<T> clazz) {
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }
    public boolean isEmpty() {
        return headIndex == SPECIAL_EMPTY_VALUE;
    }
    public boolean isFull() {
        //int newIndex = (tailIndex + 1) % MAX_SIZE;
        int newIndex = getNextTailIndex();
        return newIndex == headIndex;
    }
    private int getNextTailIndex() {
        return (tailIndex + 1) % MAX_SIZE;
    }
    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) throw new QueueOverflowException();
        tailIndex = getNextTailIndex();
        elements[tailIndex] = data;
        if (isEmpty()) headIndex = tailIndex;
    }
    public T dequeue() throws QueueUnderflowException {
//        if (isEmpty()) throw new QueueUnderflowException();
//        T data = elements[headIndex];
        T data = peek();
        if (headIndex == tailIndex) {
            headIndex = tailIndex = SPECIAL_EMPTY_VALUE;
        } else {
            headIndex = (headIndex + 1) % MAX_SIZE;
        }
        return data;
    }
    public T peek() throws QueueUnderflowException {
        if (isEmpty()) throw new QueueUnderflowException();
        return elements[headIndex];
    }
    public boolean offer(T data) {
        try {
            enqueue(data);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
    //ensarit
    public int getFreeSpot() {
        return Math.abs(tailIndex - headIndex + 1);
    }
    public int getSize() {
        return MAX_SIZE-getFreeSpot();
    }
}

