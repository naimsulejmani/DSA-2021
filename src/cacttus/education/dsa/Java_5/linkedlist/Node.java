package cacttus.education.dsa.Java_5.linkedlist;

//Kutia Nyja
public class Node {
    private int data; // te dhanen (vlerat) qe ka me i ruajtur
    private Node next; // ku ka me shku si nyje vijuese

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + getData();
    }
}
