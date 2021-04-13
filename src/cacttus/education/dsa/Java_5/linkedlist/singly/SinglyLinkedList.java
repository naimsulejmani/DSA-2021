package cacttus.education.dsa.Java_5.linkedlist.singly;

public class SinglyLinkedList {
    private Node head;
    private int counter;
    //private Node first;

    public SinglyLinkedList() {
        counter = 0;
    }

    private void increment() {
        ++counter;
    }

    private void decrement() {
        --counter;
    }


    public void addFirst(int data) {
        Node newNode = new Node(data);
        //para se me ndru referencen e head, ruaje referencen e head tek nexti i nyjes se re
        newNode.setNextNode(head);
        //pastaj ndro reference e head (fillimit)
        head = newNode;
        increment();
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node iter = head;
            while (iter.getNextNode() != null) {
                iter = iter.getNextNode();
            }
            iter.setNextNode(newNode);
            increment();
        }
    }

    public Node findByIndex(int index) {
        if (index >= counter) return null;
        Node iter = head;
        for (int i = 0; i < index; i++) {
            iter = iter.getNextNode();
        }
        return iter;
    }

    public void addAfterIndex(int index, int data) {
        Node node = findByIndex(index);

        if (node == null) {
            System.out.println("Nuk mund te insertosh ketu index!!!");
            return;
        }
        Node newNode = new Node(data);
        newNode.setNextNode(node.getNextNode());
        node.setNextNode(newNode);
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("NO nodes in Sinly Lineked List");
            return;
        }
        Node iter  = head;
        while(iter!=null) {
            System.out.printf("%s --> ",iter);
            iter = iter.getNextNode();
        }
    }















       /*

                        addFrist -> insertFirst
                        addLast -> insertLast
                        addAt -> insertAt
                        removeFirst -> deleteFirst
                        removeLast -> deleteLast
                        deleteAt -> removeAt
                        find -> get
                        exists -
                        isEmpty ->
                        length - count,
                        toArray -> Node[]
                        Node[] -> LinkedList
                        print

        */


}
