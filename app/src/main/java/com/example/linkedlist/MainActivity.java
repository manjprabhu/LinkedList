package com.example.linkedlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList linkedList = new LinkedList();

        LinkedList.Node node = linkedList.createNode(10);
        linkedList.InsertFrontFront(node);

        LinkedList.Node node1= linkedList.createNode(12);
        linkedList.InsertFrontFront(node1);

        LinkedList.Node node2 = linkedList.createNode(14);
        linkedList.InsertFrontFront(node2);

        linkedList.insertAfter(node2,20);

        LinkedList.Node node3= linkedList.createNode(18);
        linkedList.InsertFrontFront(node3);

        linkedList.insertAtEnd(1023);

        linkedList.display();

        linkedList.deleteFirstNode();

        linkedList.display();
    }
}