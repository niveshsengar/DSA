package com.test.dsa.ll;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){

        System.out.println("HEAD: "+head.value);
    }

    public void getTail(){

        System.out.println("TAIL: "+tail.value);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node get(int index){
        if(length == 0){
            return null;
        }
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node remove(int index){
        if(index < 0 || index >= length){
            return null;
        }
        if(index == 0){
            return removeFirst();
        }
        if(index == length - 1){
            return removeLastMyMethod();
        }

        Node nodeBeforeRemove = get(index - 1);
        Node temp = nodeBeforeRemove.next;
        nodeBeforeRemove.next = temp.next;
        length--;
        return temp;
    }

    public void insert(int index, int value){
        Node newNode = new Node(value);
        if(index < 0 || index >= length){
            System.out.println(index +" index not valid");
            return;
        }
        if(index == 0){
            prepend(value);
        } else if(index == length - 1){
            append(value);
        }else {
            Node nodeBeforeInsert = get(index - 1);
            Node temp = nodeBeforeInsert.next;
            nodeBeforeInsert.next = newNode;
            newNode.next = temp;
        }
        length++;

    }

    public void reverse(){
        if(length == 0 || length == 1){
            System.out.println("nothing to reverse");
            return;
        }
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after = temp.next;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }



    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else {
            newNode.next = head.next;
            head = newNode;
        }

    }

    public void set(int index, int value){
        if(length == 0){
            System.out.println(String.format("Cannot set value, index %d not exist", index));
        }
        if(index < 0 || index >= length){
            System.out.println(String.format("Cannot set value, index %d not exist", index));
        }
        Node node = get(index);
        node.value = value;

    }

    public Node removeFirst(){
        if (length == 0){
            return null;
        }
        Node temp = head;
        if (length == 1){
            head = null;
            tail = null;
        }
        head = head.next;
        return temp;
    }

    public Node removeLastMyMethod(){
        if(length == 0){
            System.out.println("No nodes to remove");
            return null;
        }
        Node temp = head;
        Node previousTail = tail;
        if(length == 1){
            tail = null;
            head = null;
        }else {
            while (temp.next != tail){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        }
        length--;
        return previousTail;
    }

    public Node removeLastHisMethod(){
        if(length == 0){
            return null;
        }

        Node temp = head;
        Node pre = head;

        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        return temp;
    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public void partitionList(int x) {

        if (head == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;
        head = dummy1.next;
    }
}
