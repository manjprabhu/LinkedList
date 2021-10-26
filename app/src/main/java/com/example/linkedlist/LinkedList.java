package com.example.linkedlist;

import android.util.Log;

public class LinkedList {

    Node head = null;
    Node tail = null;

    public Node createNode(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    public void InsertFrontFront(Node node) {
//        Node node = createNode(data);
        node.next = head;
        head = node;
    }

    // Insert an element after the given element.
    // Here we are given pointer to the node , we have to insert a node after that node.
    public void insertAfter(Node prev_node, int data) {
        Node node = createNode(data);
        node.next = prev_node.next;
        prev_node.next = node;
    }

    public void insertAtEnd(int data) {
        Node newNode = createNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        //Traverse the list till we find the end of list (i.e tail.next = null);
        newNode.next = null;
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
//      mark next of current last node to point to newlay added node.
        tail.next = newNode;
    }

    //Delete the first node.
    public void deleteFirstNode() {
        if(head == null) {
            return;
        }

        Node temp = head;
        head = head.next;
    }

    public void deleteLastNode() {

    }

    public void display() {
        Node current = head;
        if (head == null) {
            Log.v("LinkedList", "Empty List");
            return;
        }
        while (current != null) {
            Log.v("LinkedList", "List:" + current.data);
            current = current.next;
        }
        System.out.println();
    }

    class Node {
        int data;
        Node next;
    }

}
