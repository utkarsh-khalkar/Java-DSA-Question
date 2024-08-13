package com.linkedList;

import java.time.LocalDate;

public class basicLL {

    public static  class  Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }


    }
    public  static void showLinkedList(Node a)
    {
        Node temp=a;
        while (temp !=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void display(Node head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(" "+head.data);
        display(head.next);
    }
    public static void displayReverse(Node head)
    {
        if(head==null)
        {
            return;
        }
        displayReverse(head.next);
        System.out.print(" "+head.data);

    }

    public static  void lengthOfList(Node head)
    {
        Node temp=head;
        int cnt=0;
        while (temp !=null)
        {
            cnt++;
            temp=temp.next;
        }
        System.out.println("Linked List Length is:"+cnt);
    }
    public static void reverseList(Node head)
    {
        Node pre=null;
        Node curr=head;
        Node next=null;

        while (curr !=null)
        {
            next=curr.next;
            curr.next=pre;

            


        }
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);

        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(d.next);

//        Node temp=a;
//        while (temp !=null)
//        {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
        showLinkedList(a);
        display(a);

        LocalDate localDate=LocalDate.now();
        System.out.println();
        System.out.println(localDate);

        displayReverse(a);
        System.out.println();
        lengthOfList(a);

    }
}
