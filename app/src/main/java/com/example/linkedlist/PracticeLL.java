package com.example.linkedlist;

import android.util.Log;

public class PracticeLL {

    private final String TAG = PracticeLL.class.getSimpleName();
    Node front = null;

    void insertAtFront(Node node) {
        node.next = front;
        front = node;
    }

    void insertEnd(Node node) {
        Node temp = front;
        if (front == null) {
            Log.d(TAG, "insertEnd: empty list");
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;

    }

    void display() {

        Node temp = front;

        while (temp != null) {
            Log.d(TAG, "display: Data:" + temp.data);
            temp = temp.next;
        }

    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void deleteWithoutHeadNode(Node deleteNode) {
        Node temp = deleteNode.next;
        deleteNode.data = temp.data;
        deleteNode.next = temp.next;
    }

}
