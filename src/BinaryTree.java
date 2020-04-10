public class BinaryTree {
    protected Node root;

    public BinaryTree() {
    }

    public void add(int key, String name) {
        Node currentNode = root;
        Node parentNode;
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
            return;
        } else {
            while (true) {
                if (key < currentNode.key) {
                    parentNode = currentNode;
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        parentNode.left = newNode;
                        return;
                    }
                } else {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parentNode.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void postOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            postOrderTraverse(focusNode.left);
            postOrderTraverse(focusNode.right);
            System.out.println(focusNode);
        }
    }

    public void preOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrderTraverse(focusNode.left);
            preOrderTraverse(focusNode.right);
        }
    }

    public void inOrderTraverse(Node focusNode) {
        if (focusNode != null) {
            inOrderTraverse(focusNode.left);
            System.out.println(focusNode);
            inOrderTraverse(focusNode.right);
        }
    }
}
