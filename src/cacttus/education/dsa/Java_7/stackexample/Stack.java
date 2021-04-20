package cacttus.education.dsa.Java_7.stackexample;

public class Stack<T> {
    private static final int MAX_SIZE = 100;
    private Element<T> top;//topmost element on Stack
    private int size = 0;//stack counter O(1)

    public void push(T data) throws StackOverflowException {
        if (isFull()) {
            //aplikacioni jone nderpritet ketu nese plotesohet kushti the gjuhet ky gabim i meposhtem
            throw new StackOverflowException();
        }
        Element newElement = new Element(data, top);
        top = newElement;
        size++;
    }
    public T pop() throws StackUnderflowException {
//        if (size == 0) {
//            throw new StackUnderflowException();
//        }
//        T removedData = top.getData();
        T removedData = peek();
        top = top.getNext();
        size--;
        return removedData;
    }
    public T peek() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException();
        }
        return top.getData();
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == MAX_SIZE;
    }
    public int getSize() {
        return size;
    }
}
