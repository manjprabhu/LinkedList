package com.example.linkedlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LinkedList linkedList = new LinkedList();
//
//        LinkedList.Node node = linkedList.createNode(10);
//        linkedList.InsertFront(node);
//
//        LinkedList.Node node1= linkedList.createNode(12);
//        linkedList.InsertFront(node1);
//
//        LinkedList.Node node2 = linkedList.createNode(14);
//        linkedList.InsertFront(node2);
//
////        linkedList.insertAfter(node2,20);
//
//        LinkedList.Node node3= linkedList.createNode(18);
//        linkedList.InsertFront(node3);
//
////        linkedList.insertAtEnd(1023);
//
////        linkedList.deleteLastNode();
//
////        linkedList.display();
//
//        linkedList.checkIfListisCircular();
//
////        linkedList.display();
//
//        CircularLinkedList circularLinkedList = new CircularLinkedList();
//
//        LLPractice llPractice = new LLPractice();
//        LLPractice.Node llNode = llPractice.new Node(10);
//
//
//
//        LLPractice.Node llNode1 = llPractice.new Node(20);
////        llNode.next = llNode1;
//
//        LLPractice.Node llNode2 = llPractice.new Node(30);
////        llNode.next.next = llNode2;
//
//        LLPractice.Node llNode3 = llPractice.new Node(40);
////        llNode.next.next.next = llNode;
//
//        llPractice.push(llNode);
//        llPractice.push(llNode1);
//        llPractice.push(llNode2);
//        llPractice.push(llNode3);
//
//        LLPractice.Node llNode4 = llPractice.new Node(410);
//        llPractice.addAtTheEnd(llNode4);
//
////        llPractice.display();
//
//
//        LLPractice.Node llNode5 = llPractice.new Node(110);
//
//        llPractice.addAfterNode(llNode2,llNode5);
//        Log.v("LLPractice","***********************************");
//        llPractice.checkForCircularList();
//        llPractice.display();

        LLPractice llPractice = new LLPractice();
        LLPractice.Node node = llPractice.new Node(100);
        LLPractice.Node node1 = llPractice.new Node(111);
        LLPractice.Node node2 = llPractice.new Node(122);
        LLPractice.Node node3 = llPractice.new Node(133);
        LLPractice.Node endNode = llPractice.new Node(90);
        LLPractice.Node endNode1 = llPractice.new Node(160);
        LLPractice.Node endNode2 = llPractice.new Node(160);
        LLPractice.Node endNode3 = llPractice.new Node(160);


       llPractice.insertAtTheFront(node);
       llPractice.insertAtTheFront(node1);
        llPractice.insertAtTheFront(node2);
        llPractice.insertAtTheFront(node3);
        llPractice.insertAtTheFront(endNode);
        llPractice.insertAtTheFront(endNode1);
        llPractice.insertAtTheFront(endNode2);
        llPractice.insertAtTheFront(endNode3);


        llPractice.nNodefromlast(12);


//        llPractice.inseratend(node3);

        // Just to make list circular.
//        llPractice.head.next.next.next.next = llPractice.head;

//        llPractice.display();

//        llPractice.deleteGivenPosition(1);
//        Log.v("LLPractice","***********************************");
//        llPractice.reverseLinkedList();
        llPractice.display();

    }
}