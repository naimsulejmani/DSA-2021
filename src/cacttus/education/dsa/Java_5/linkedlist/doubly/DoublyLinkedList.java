package cacttus.education.dsa.Java_5.linkedlist.doubly;

import jdk.swing.interop.SwingInterOpUtils;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int counter;

    public DoublyLinkedList() {
        counter = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private void increment() {
        counter++;
    }

    private void decrement() {
        counter--;
    }

    public void addFirst(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            //nyja re thote une ka me qu te ai qe ka qene perpara head
            newNode.setNextNode(head);
            //head thote une ka me kthy te qajo qe po vendoset si head i ri
            head.setPrevNode(newNode);
            //ndro referencen per head
            head = newNode;
        }
        increment();
    }

    public void addLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            //bishti (last) ka me dergu tek nyja e re
            tail.setNextNode(newNode);
            //nyja e re duhet me kthy prap (prev) tek nyja paraprak qe qene bisht
            newNode.setPrevNode(tail);
            //ndro referencen e bishti (tail) last
            tail = newNode;
        }

        increment();
    }

    public DoublyNode findByIndex(int index) {
        if (index >= counter) return null;

        DoublyNode iter = head;
        for (int i = 0; index < counter; i++) {
            iter = iter.getNextNode();
        }
        return iter;
    }

    public void addAfterIndex(int index, int data) {
        DoublyNode node = findByIndex(index);
        if (node == null) {
            System.out.println("Nuk mundesh me shtu ketu kete nyje!!!");
            return;
        }

        System.out.println("FINDED NODE = " + node);
        //next node of finded node by index
        DoublyNode nextNode = node.getNextNode();
        System.out.println("FINDED NEXT NODE = " + nextNode);

        DoublyNode newNode = new DoublyNode(data);
        System.out.println("NEW NODE " + newNode);
        //nyja e re ka me dergu tek nyja next e finded
        newNode.setNextNode(nextNode);
        //nese nyja next e finded eshte null atehere parapraki i saj eshte nyja e re
        if (nextNode != null) nextNode.setPrevNode(newNode);


        node.setNextNode(newNode);
        newNode.setPrevNode(node);
    }


}
