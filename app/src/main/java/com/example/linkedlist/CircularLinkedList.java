package com.example.linkedlist;

import android.util.Log;

public class CircularLinkedList {

    private final String TAG = CircularLinkedList.class.getSimpleName();
    Node head = null;

    class Node {
        Node next;
        int data;
    }

    void push(Node node) {
        node.next = head;
        head = node;
    }

    void display() {
        Node current = head;
        while (current.next!=null) {
            Log.v(TAG,"Element of List:"+ current.data);
        }
    }
}
