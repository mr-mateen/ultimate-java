public class List {
    private Node headNode, currentNode, lastCurrentNode;
    private int size;

    List() {
        headNode = new Node();
        headNode.setNext(null);
        currentNode = null;
        size = 0;
    }

    public void add(int newObject) {
        Node newNode = new Node();
        newNode.set(newObject);
        if (currentNode != null) {
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            lastCurrentNode = currentNode;
            currentNode = newNode;
        } else {
            newNode.setNext(null);
            headNode.setNext(newNode);
            lastCurrentNode = headNode;
            currentNode = newNode;
        }
        size++;
    }

    public int get() {
        // if (currentNode != null)
            return currentNode.get();
        // return 0;
    }

    public boolean next() {
        if (currentNode == null || size == 0)
            return false;

        lastCurrentNode = currentNode;
        currentNode = currentNode.getNext();
        return true;
    }

    public void start() {
        lastCurrentNode = headNode;
        currentNode = headNode;
    }

    public void remove() {
        if (currentNode != null && currentNode != headNode) {
            lastCurrentNode.setNext(currentNode.getNext());
            // delete currentNode;
            currentNode = lastCurrentNode.getNext();
            size--;
        }
    }

    public int length() {
        return size;
    }
}
