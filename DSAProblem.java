package com.company;

class Node
{
    int roll_no;
   String name;
    int marks;
    Node next;
    Node(int roll_no,String name,int marks )
    {
        this.roll_no=roll_no;
        this.name=name;
        this.marks=marks;
        this.next=null;
    }
}
class LinkedList {
    Node head;

    public void insert(int roll_no, String name, int marks) {
        Node n1 = new Node(roll_no, name, marks);
        if (head == null) {
            head = n1;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n1;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.roll_no + "->" + temp.name + "->" + temp.marks"->");
            temp.next = temp;
        }
        System.out.println("Null");
    }
}
public class DSAProblem {
    public static void main(String[] args) {
        LinkedList L1 = new LinkedList();
        L1.insert(1, "ram", 90);
        L1.insert(2, "dom", 91);
        L1.insert(3, "tom", 93);
        L1.insert(4, "sham", 99);
        L1.show();

    }
}















}
