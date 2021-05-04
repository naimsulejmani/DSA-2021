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
        if (root == null) return;//M-RR-D
        inorder(root.getLeft());
        System.out.println(root.getKey());
        inorder(root.getRight());
    }

    public void preOrderTraversal() {
        preorder(root);
    }

    //RR -> M -> D
    private void preorder(Node root) {
        if (root == null) return;
        System.out.println(root.getKey());
        preorder(root.getLeft());
        preorder(root.getRight());
    }

    //postorder traversal
    // M->D->RR
    public void postOrderTraversal() {
        postorder(root);
    }

    private void postorder(Node root) {
        if (root == null) return;
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.println(root.getKey());
    }

    //naim_traversal
    //desc_inorder
    //D-RR-M

    public void desc_inorderTraversal() {
        desc_inorder(root);
    }

    private void desc_inorder(Node root) {
        if (root == null) return;
        desc_inorder(root.getRight());
        System.out.println(root.getKey());
        desc_inorder(root.getLeft());
    }

    public int minimum() throws NoElementException {
        if (isEmpty()) {
            //throw exception
            throw new NoElementException("BST nuk ka asnje elemetn!!!");
        }
        Node iter = root;
        while (iter.getLeft() != null) {
            iter = iter.getLeft();
        }
        return iter.getKey();
    }

    public int maximum() throws NoElementException {
        if (isEmpty())
            throw new NoElementException("BST nuk ka asnje element!");
        Node iter = root;
        while (iter.getRight() != null) {
            iter = iter.getRight();
        }
        return iter.getKey();
    }
}









