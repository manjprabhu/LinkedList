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

    public void InsertFront(Node node) {
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

        if(head == null) {
            return;
        }

        Node second_last = head;
        // Traverse the list until we find the second last node.

        while (second_last.next.next!=null) {
            second_last = second_last.next;
        }
        // Once we find the 2nd last node, make  next of the 2nd last node to null.
        second_last.next = null;
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

    void secondLargestElement() {

        Node current = head;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        while(current.next!=null) {
            if(current.data> max) {
                int temp = max;
                max = current.data;
                smax = temp;
            } else if(current.data < max && current.data > smax) {
                smax = current.data;
            }
            current = current.next;
        }
        Log.v("LinkedList","=== Largest:"+ max + " second max:"+ smax);
    }

    void secondLastNode() {
        Node current = head;

        while(current.next.next!=null) {
            current = current.next;
        }

        Log.v("LinkedList"," Second Last Node:"+ current.data);
    }

    void checkIfListisCircular() {
        Node current = head;

        while(current.next!=null && current.next!=head) {
            current = current.next;
        }

        if(current== head) {
            Log.v("LinkedList"," Linked list is circular");
        } else {
            Log.v("LinkedList"," Linked list is not circular");
        }
    }

    // Here since we dont have head pointer, idea is to swap the delete node with next node, this is solution will work only
    // delete node is not last node.

    void deleteANodeWithoutHeadNode(Node del) {

        //Find next node using next pointer
        Node temp =  del.next;

        // Copy data of next node to this node
        del.data = temp.data;

        //Unlink the next node.
        del.next = temp.next;

    }



    class Node {
        int data;
        Node next;
    }

}
