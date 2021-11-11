package com.example.linkedlist;

import android.util.Log;

import java.util.HashSet;

public class LLPractice {

    private final String TAG = LLPractice.class.getSimpleName();
    Node head, tail;
    private Node head1, tail1;

    void insertAtTheFront(Node front) {
        front.next = head;
        head = front;
    }

    void inseratend(Node end) {

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = end;
        end.next = null;
    }

    void insertAfterNode(Node after, Node newNode) {

        Node temp = head;

        while (temp.data == after.data) {
            temp = temp.next;
        }
        newNode.next = after.next;
        after.next = newNode;

    }

    void deleteGivenNode(Node del) {
        Node temp = head;
        while (temp.next.data != del.data) {
            temp = temp.next;
        }
        temp.next = del.next;
    }

    void deleteGivenPosition(int pos) {
        Node temp = head;
        int tPos = 0;
        while (tPos != pos - 1) {
            tPos = tPos + 1;
            temp = temp.next;
            Log.v(TAG, "temp.Data:" + temp.data + " tPos:" + tPos);
        }

        temp.next = temp.next.next;
    }

    void lengthOfLL() {
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            temp = temp.next;
            count = count + 1;
        }

        Log.v(TAG, "===>>> Length of the LL:" + count);
    }

    void searchAnElement(Node node) {
        Node temp = head;

        boolean found = false;
        while (temp.next != null) {
            if (temp.data == node.data) {
                found = true;
                break;
            } else {
                temp = temp.next;
                found = false;
            }
        }
        if (found) {
            Log.v(TAG, "===>>> Element found:");
        } else {
            Log.v(TAG, "===>>> Element  not found:");
        }
    }

    void findMiddleElement() {
        Node temp = head;
        int count = 0;
        do {
            count = count + 1;
            temp = temp.next;
        } while (temp.next != null);

        temp = head;
        for ( int i = 0; i < count / 2; i++ ) {
            temp = temp.next;
        }
        Log.v(TAG, "===>> Middle node is:" + temp.data);
    }

    void findMiddleElement2() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        Log.v(TAG, "Middle element is :" + slow.data);
    }

    void countOccurence(Node node) {
        Node temp = head;
        int data = node.data;
        int count = 0;

        do {
            if(temp.data == data) {
                count = count+1;
            }
            temp = temp.next;

        } while (temp.next!=null);

        Log.v(TAG, "Element :"  +data + "  Occurred " + count + "  times");
    }

    void nNodefromlast(int n) {
        Node temp = head;
        int len = 0;

        while(temp!=null) {
            len  = len +1;
            temp = temp.next;
        }

        int x = len-n;
        temp = head;

        for(int i=0;i<x;i++) {
            temp = temp.next;
        }

        Log.v(TAG, "Element found at:"+ temp.data);
    }

    void checkForIdenticalList() {
        Node temp1= head;
        Node temp2 = head;

        while(temp1!=null && temp2!=null) {
            if(temp1.data != temp2.data) {

            }
        }
    }


//    *******************************************************************************

    void insertAtFront(Node node) {
        node.next = head;
        head = node;
    }

    void insertAtEnd(Node node) {
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
        node.next = null;
    }

    void deleteFrontNode() {
        Node front = head;
        head = front.next;
    }

    void deleteLastNode() {
        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    void insertAfterANode(Node node, Node newNode) {
        Node current = head;

        while (current.data != node.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    void deleteSpecificNode(Node node) {
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
    }

    void detectLoopinList() {

        HashSet<Node> nodes = new HashSet<>();

        Node current = head;

        while (current != null) {

            if (nodes.contains(current)) {
                Log.v(TAG, "===>>> Circular List");
                return;
            }

            nodes.add(current);
            current = current.next;
        }

    }

    void detectLoopFloydsAlgorithm() {

        Node first = head;
        Node second = head;

        while (first != null && second != null) {
            first = first.next;
            second = second.next.next;

            if (first == second) {
                Log.v(TAG, "===>>> Circular List");
                return;
            }
        }

    }

    void reverseLinkedList() {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    //Add to front
    void push(Node node) {
        node.next = head;
        head = node;
    }

    void addAtTheEnd(Node node) {

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        Node current = head;
        Node temp = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
        node.next = null;
    }

    void deleteFromFront() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    void deleteFromLast() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    void addAfterNode(Node node, Node newNode) {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.data != node.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    void checkForCircularList() {
        Node current = head;

        while (current.next != null && current.next != head) {
            current = current.next;
        }

        if (current == head) {
            Log.v(TAG, "List is circular");
        }
    }

    void display() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Log.v(TAG, "Data in LL :" + current.data);
            current = current.next;
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

   /* class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }*/
}
