
public class CircleList {

    Node head;

    public static CircleList add(CircleList list, int data) {

        Node newNode = new Node(data);
        newNode.previous = list.head;

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

    public static void printList(CircleList list) {

        Node currentNode = list.head;

        while (currentNode != null) {

            System.out.println(currentNode.data);
            currentNode = currentNode.next;

        }

    }

    public static void main(String[] args) {

        CircleList list = new CircleList();

        list = add(list, 1);
        list = add(list, 2);
        list = add(list, 3);
        list = add(list, 4);
        list = add(list, 4);
        list = add(list, 5);

        printList(list);

    }

}