package cacttus.education.dsa.Java_8_trees;

public class TestBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(100);
        bst.insert(10);
        bst.insert(20);
        bst.insert(200);
        bst.insert(150);
        bst.insert(50);
        //bst.inOrderTraversal();
        //bst.preOrderTraversal();
        bst.postOrderTraversal();
        try {
            System.out.println(bst.minimum());
            System.out.println(bst.maximum());
        } catch (NoElementException e) {
            e.printStackTrace();
        }
    }
}
