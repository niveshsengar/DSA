package com.test.dsa.ll;

public class Main {
    public static void main(String[] args) {

        LinkedList l = new LinkedList(5);
        l.append(7);
        l.append(3);
        l.append(2);
        l.append(9);
        l.append(10);

        l.partitionList(7);
        l.printList();



    }
}