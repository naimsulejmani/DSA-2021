package cacttus.education.dsa.Java_5.linkedlist.doubly;

public class DoublyNode {

    private int data;
    private DoublyNode prevNode;
    private DoublyNode nextNode;

    public DoublyNode(int data) {
        this.data = data;
    }

    public DoublyNode(int data, DoublyNode prevNode, DoublyNode nextNode) {
        this.data = data;
        this.prevNode = prevNode;
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyNode prevNode) {
        this.prevNode = prevNode;
    }

    public DoublyNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return Integer.toString(data);
    }
}
