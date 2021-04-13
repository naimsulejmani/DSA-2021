package cacttus.education.dsa.Java_5.linkedlist.doubly;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyNode firstNode = new DoublyNode(10);

        DoublyNode secondNode = new DoublyNode(20);

        DoublyNode zeroNode = new DoublyNode(0);

        zeroNode.setNextNode(firstNode);
        firstNode.setNextNode(secondNode);
        //secondNode.setNextNode(null);

        secondNode.setPrevNode(firstNode);
        firstNode.setPrevNode(zeroNode);
        //zeroNode.setPrevNode(null);

        //PING - PONG

        DoublyLinkedList dll = new DoublyLinkedList();
        System.out.println(
                firstNode.getNextNode().getPrevNode().getNextNode().getPrevNode()
                        .getNextNode().getPrevNode().getData()
        );

    }
}
