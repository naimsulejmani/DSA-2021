package cacttus.education.dsa.Java_5.linkedlist;

public class LinkedList {
    private Node header; // first

    //add last shto nje nyje ne fund
    public void addLast(int data) {
        Node newNode = new Node(data); //masi eshte nyja e fundit nuk ka nevoj eme pas next (null)
        if (header == null) {
            header = newNode;
        } else {
            Node startNode = header;
            //perderisa nyja qe e krahasojme pasuesi i saj nuk eshte nuyll shko tek nyja tjeter (derisa te vijme tek
            //ajo nyje e cila pasuesin e ka null)
            while (startNode.getNext() != null) {
                startNode = startNode.getNext();
            }
            startNode.setNext(newNode);
        }
    }

    //add first shto nje nyje ne fillim
    public void addFirst(int data) {
        //krijo nje nyje qe e dhena eshte ajo qe e i kemi dhene,
        //dhge elementi vijues eshte header qe ka qene paraprakisht
        Node newNode = new Node(data, header);
        header = newNode; //mbishkruje adresen e fillimit (header-it)
    }


    public void printAll() {
        Node startNode = header;
        //gabimisht
        while (startNode != null) {
            System.out.println(startNode);
            startNode = startNode.getNext();
        }
        // O(N)


    }


}
