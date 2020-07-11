
public class Node {

    public Node previous;
    public int data;
    public Node next;

    public Node(int d) {
        previous = null;
        data = d;
        next =null;

    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setprevious(Node previous) {
        this.previous = previous;
    }

    public Node getprevious() {
        return previous;
    }

}