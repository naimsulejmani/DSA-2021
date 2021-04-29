package cacttus.education.dsa.Java_8_trees;

import java.util.Comparator;

//public class LinkedList<T> { private Node<T> head;}
public class BinarySearchTree {
    private Node root;
    private int counter;

    public BinarySearchTree() {
        counter = 0;
    }

    public int size() {
        return counter;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int key) {
        Node newNode = new Node(key);
        counter++;
        if (isEmpty()) {
            root = newNode;
        } else {
            //root=root.getLeft();
            Node iter = root;
            while (iter != null) {
                if (iter.getKey() > key) {
                    if (iter.getLeft() == null) {
                        iter.setLeft(newNode);
                        break;
                    } else iter = iter.getLeft();
                    //shko majtas
                } else {
                    if (iter.getRight() == null) {
                        iter.setRight(newNode);
                        break;
                    } else iter = iter.getRight();
                    //shko djathtas
                }
            }
        }
    }

    public void inOrderTraversal() {
        inorder(root);
    }

    private void inorder(Node root) {
        if (root == null) return;
        inorder(root.getLeft());
        System.out.println(root.getKey());
        inorder(root.getRight());
    }


}









