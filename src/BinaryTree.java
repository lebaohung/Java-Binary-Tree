public class BinaryTree {
    protected Node root;
    protected Node parentNode;

    public BinaryTree() {
    }

    public void add(int key, String name) {
        Node currentNode = root;
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

    public boolean search(Node root, Node searchNode) {
        if (searchNode != null && root != null) {
            if (searchNode.key == root.key) return true;
            if (root.key > searchNode.key) {
                parentNode = root;
                if (search(parentNode.left, searchNode)) return true;
                else return false;
            } else {
                parentNode = root;
                if (search(parentNode.right, searchNode)) return true;
                else return false;
            }
        }
        return false;
    }

    public void delete(Node deleteNode) {
        if (!search(root, deleteNode) ) {
            System.out.println("Could not delete Node has key " + deleteNode.key + " in tree!");
        } else {
            System.out.println("Deleting node has key: " + deleteNode.key + "...");
            Node temp;
            Node tempParent;
            Node deleteParent ;
            if (deleteNode.key == root.key) {
                tempParent = root.right;
                temp = root.left;
                root = root.right;
            } else if (parentNode.left.key == deleteNode.key) {
                temp = parentNode.left.left;
                parentNode.left = parentNode.left.right;
                tempParent = parentNode.left;
            } else {
                temp = parentNode.right.left;
                parentNode.right = parentNode.right.right;
                tempParent = parentNode.right;
            }
            if (tempParent != null) {
                while (tempParent.left != null) {
                    tempParent = tempParent.left;
                }
                tempParent.left = temp;
            }
            System.out.println("Complete!");
        }
    }
}
