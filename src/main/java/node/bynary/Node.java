package node.bynary;

public class Node {
    public Object data;
    public Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(Object data) {
        this(data, null);
    }

    @Override
    public String toString() {
        return "node.bynary.Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
