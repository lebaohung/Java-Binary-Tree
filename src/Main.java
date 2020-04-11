import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(50, "five");
        tree.add(10, "one");
        tree.add(20, "two");
        tree.add(15, "four");
        tree.add(80, "eight");
        tree.add(60, "");
        tree.add(90, "");
        tree.add(5, "");
        tree.add(40, "");


//        tree.postOrderTraverse(tree.root);
//        tree.inOrderTraverse(tree.root);
//        tree.preOrderTraverse(tree.root);
        Node newNode = new Node(90, "one");
//        System.out.println(tree.search(tree.root, newNode));
        tree.delete(newNode);
        tree.preOrderTraverse(tree.root);

    }

}
