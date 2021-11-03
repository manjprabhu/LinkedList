package com.example.linkedlist;

import android.util.Log;

import java.util.HashSet;

public class LLPractice {

    private final String TAG = LLPractice.class.getSimpleName();
    Node head, tail;

    void insertAtFront(Node node) {
        node.next = head;
        head = node;
    }

    void insertAtEnd(Node node) {
        Node current = head;

        while(current.next!=null) {
            current = current.next;
        }

        current.next = node;
        node.next = null;
    }

    void deleteFrontNode() {
        Node front  = head;
        head = front.next;
    }

    void deleteLastNode() {
        Node current = head;

        while(current.next.next!=null) {
            current = current.next;
        }
        current.next = null;
    }

    void insertAfterANode(Node node, Node newNode) {
        Node current = head;

        while(current.data!=node.data) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }


    void deleteSpecificNode(Node node) {
      Node temp =  node.next;
      node.data = temp.data;
      node.next = temp.next;
    }

    void detectLoopinList() {

        HashSet<Node> nodes = new HashSet<>();

        Node current = head;

        while(current !=null) {

            if(nodes.contains(current))  {
                Log.v(TAG,"===>>> Circular List");
                return;
            }

            nodes.add(current);
            current = current.next;
        }

    }

    void detectLoopFloydsAlgorithm() {

        Node first = head;
        Node second = head;

        while(first!=null && second!=null) {
            first = first.next;
            second = second.next.next;

            if(first == second) {
                Log.v(TAG,"===>>> Circular List");
                return;
            }
        }

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
        Node temp  = head;

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

    void addAfterNode(Node node,Node newNode) {
        if(head == null) {
            return;
        }
        Node current = head;
        while (current.data!=node.data) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    void checkForCircularList() {
        Node current = head;

        while(current.next!=null && current.next!=head) {
            current = current.next;
        }

        if(current == head) {
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

        Node(int d) {
            data = d;
            next = null;
        }
    }
}
