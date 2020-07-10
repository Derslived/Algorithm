package com.groot.day2;

import com.groot.day2.util.Node;

public class LinkedList {

    Node head;

    public static LinkedList add(LinkedList list, int data) {

        Node newNode = new Node(data);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {

            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;

        }

        return list;

    }

    public static LinkedList deleteByKey(LinkedList list, int key) {

        Node previousNode = null;
        Node currentNode = list.head;

        if (currentNode != null && currentNode.data == key) {

            list.head = currentNode.next;
            return list;

        }

        while (currentNode != null && currentNode.data != key) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            previousNode.next = currentNode.next;
        }

        if (currentNode == null) {
            System.out.println("Not Found");
        }
        return list;

    }

    public static void printList(LinkedList list) {

        Node currentNode = list.head;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list = add(list, 10);
        list = add(list, 11);
        list = add(list, 12);
        list = add(list, 13);

        printList(list);

        System.out.println("-------------------- after delete---------------");

        list = deleteByKey(list, 12);

        printList(list);
    }

}