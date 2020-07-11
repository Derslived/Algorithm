
public class DoubleList {

    Node head;

    public static DoubleList add(DoubleList list, int data) {

        Node newNode = new Node(data);
        newNode.previous = null;

        if (list.head == null) {
            list.head = newNode;

        } else {

            Node lastNode = list.head;

            while (lastNode.next != null) {
               lastNode = lastNode.next;
            }

            lastNode.next = newNode;

            newNode.previous = lastNode;

        }

        return list;

    }

    public static void printList(DoubleList list) {

        Node currentNode = list.head;

        while (currentNode != null) {

            System.out.println(currentNode.data);
            currentNode = currentNode.next;

        }

    }

    public static void main(String[] args) {

        DoubleList list = new DoubleList();

        list = add(list, 1);
        list = add(list, 2);
        list = add(list, 3);
        list = add(list, 4);
        list = add(list, 4);
        list = add(list, 5);

        printList(list);

    }

}