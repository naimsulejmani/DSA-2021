package cacttus.education.dsa.Java_7.queues;

public class QueueLinkedList<T> {
    private final int MAX_SIZE = 100;
    private int counter = 0;
    Element<T> head;
    Element<T> tail;
    public QueueLinkedList() {
        //default constructor
    }
    public boolean isEmpty() {
        return counter == 0;
    }
    public boolean isFull() {
        return counter == MAX_SIZE;
    }
    public void enqueueWithPriority(T data, Priority priority) throws QueueOverflowException {
        if (isFull()) throw new QueueOverflowException();

        Element<T> newElement = new Element<>(data, null, priority);
        if (isEmpty()) {
            head = tail = newElement;
            return;
        }
        Element<T> iter = head;
        while (iter != null && newElement.priority.compareTo(iter.priority) > 0) {
        }
        //elementi i ri 3,3,3,2,2,2,2,1,1,1,1
        //elementi i ri 3
        //nese eshte zbrazet -> ka me qene elementi i pare
        //nese a ke nje elemnt ->

    }

    public void enqueue(T data) throws QueueOverflowException {
        if (isFull()) throw new QueueOverflowException();
        Element<T> newElement = new Element<>(data, null);
        if (isEmpty()) {
            head = tail = newElement;
        } else {
            tail.setNext(newElement);
            tail = newElement;
        }
        counter++;
    }
    public T peek() throws QueueUnderflowException {
        if (isEmpty()) throw new QueueUnderflowException();
        return head.getData();
    }
    public T dequeue() throws QueueUnderflowException {
        T removedData = peek();
        head = head.getNext();
        counter--;
        if (isEmpty()) {
            head = tail = null;
        }
        return removedData;
    }
    public boolean offer(T data) {
        try {
            enqueue(data);
            return true;
        } catch (QueueOverflowException ex) {
            return false;
        }
    }
    public int getSize() {
        return counter;
    }
    public int getFreeSpot() {
        return MAX_SIZE - counter;
    }
}
