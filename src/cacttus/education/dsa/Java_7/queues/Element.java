package cacttus.education.dsa.Java_7.queues;

public class Element<T> {
    T data;
    Element<T> next;
    Priority priority;

    public Element(T data, Element<T> next) {
        this(data, next, Priority.LOW);
//        this.data = data;
//        this.next = next;
//        this.priority=Priority.LOW;
    }
    public Element(T data, Element<T> next, Priority priority) {
        this.data = data;
        this.next = next;
        this.priority = priority;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Element<T> getNext() {
        return next;
    }
    public void setNext(Element<T> next) {
        this.next = next;
    }
}
