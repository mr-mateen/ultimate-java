public class Node {
    private int object;
    private Node nextNode;

    public int get() {
        return object;
    }

    public void set(int object) {
        this.object = object;
    }

    public Node getNext() {
        return nextNode;
    }

    public void setNext(Node nextNode) {
        this.nextNode = nextNode;
    }

}
