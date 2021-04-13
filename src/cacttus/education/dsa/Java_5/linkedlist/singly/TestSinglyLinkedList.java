package cacttus.education.dsa.Java_5.linkedlist.singly;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node zeroNode = new Node(0, firstNode);
        firstNode.setNextNode(secondNode);

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(0);
        sll.addLast(10);
        sll.addLast(20);
        sll.addFirst(-1);
        sll.addAfterIndex(2,15);

//        System.out.println(sll.findByIndex(0));
//        System.out.println(sll.findByIndex(3));

        sll.print();


    }
}
