public class AddAndTraverse {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(5, "five");
        tree.add(1, "one");
        tree.add(2, "two");
        tree.add(4, "four");
        tree.add(8, "eight");

//        tree.postOrderTraverse(tree.root);
//        tree.inOrderTraverse(tree.root);
        tree.preOrderTraverse(tree.root);
    }
}
