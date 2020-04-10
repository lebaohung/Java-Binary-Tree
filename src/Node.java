public class Node {
    protected int key;
    protected String name;
    protected Node left;
    protected Node right;

    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return "Key " + key ;
    }

}
