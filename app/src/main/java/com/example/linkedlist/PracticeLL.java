package com.example.linkedlist;

import android.util.Log;

public class PracticeLL {

    private final String TAG = PracticeLL.class.getSimpleName();

    private Node head = null;
    private Node tail = null;

    void insertAtFront(Node node) {
        node.next = head;
        head = node;
    }

    void insertAtEndofList(Node node) {
        if (head == null) {
            Log.v(TAG, "Empty list:");
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;
    }

    void insertAfterGivenNode(Node node, Node afterNode) {
        Node temp = head;

        if (head == null) {
            Log.d(TAG, "Empty list: ");
            return;
        }

        while (temp.data != afterNode.data) {
            temp = temp.next;
        }

        node.next = afterNode.next;
        afterNode.next = node;

    }

    void insertLast(Node node) {
        Node temp = head;

        if (head == null) {
            Log.d(TAG, "Empty list:");
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
    }

    void deleteFront() {
        Node temp = head;
        if (head == null) {
            Log.d(TAG, "Empty list: ");
            return;
        }

        temp = head.next;
        head = temp;
    }

    void deleteLastNode() {
        Node temp = head;

        if(head == null) {
            Log.d(TAG, "Empty List: ");
            return;
        }
        while (temp.next.next!=null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    void display() {
        Node temp = head;

        if (head == null) {
            Log.v(TAG, "List is empty");
            return;
        }

        while (temp != null) {
            Log.v(TAG, "Item: " + temp.data);
            temp = temp.next;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

























    /*Node head = null;
    Node tail = null;

    void addElementAtFrontOfTheList(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    void insertAtTheEndOfList(Node node) {
        Node temp = head;

        while (temp.next!=null) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;
    }

    void insertAfterNode(Node after, Node node) {
        Node temp = head;

        while (temp.data!= after.data) {
            temp = temp.next;
        }

        node.next = after.next;
        after.next = node;
    }

    void deleteFrontNode() {
        if(head ==null) {
            Log.v(TAG,"Linked list is empty");
            return;
        }
        head = head.next;
    }

    void deleteLastNode() {
        if(head ==null) {
            Log.v(TAG,"Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next =null;
    }

    void deleteNodeAfterGivenNode(Node after) {
        if(head == null) {
            Log.v(TAG,"Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp.data!=after.data) {
            temp = temp.next;
        }
        after.next = after.next.next;

    }

    void deleteANode(Node node) {
        if(head == null) {
            Log.v(TAG,"Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp.next.data != node.data) {
            temp = temp.next;
        }
        temp.next = node.next;
    }

    void reverseList() {
        Node prev =null, next = null;
        Node current = head;

        while (current!=null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head = prev;
    }

    void checkForCircularList() {
        if(head ==null) {
            return;
        }

        Node temp = head;
        while(temp!=null && temp.next!=head)
            temp = temp.next;

        if(temp == head)
        Log.d(TAG,"===>>> List is circular");
        else
            Log.d(TAG,"===>>> List is NOT circular");
    }

    void checkForloop() {

    }

    void display() {
        Node temp = head;
        if(head ==null) {
            Log.v(TAG,"Linked list is empty");
            return;
        }

        Log.v(TAG,"Content of Linked list is ");
        while(temp!=null) {
            Log.d(TAG,""+temp.data);
            temp= temp.next;
        }
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }*/

}
