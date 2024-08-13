package com.linkedList;

public class LinkedListDemo {
    public static class  Node
    {
        int data;
        Node next;

        public  Node(int data)
        {
            this.data=data;
        }
    }
    public  static  class  LinkedListD{

        Node head=null;
        Node tail=null;

        public  void insertAtHead(int val)
        {
            Node temp=new Node(val);
            if(head==null)
            {
                head=tail=temp;
            }else {
                temp.next=head;
                head=temp;
            }
        }
        public void display()
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(" "+temp.data);
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListD linkedListD=new LinkedListD();
        linkedListD.insertAtHead(12);
        linkedListD.insertAtHead(1);
        linkedListD.insertAtHead(34);
        linkedListD.insertAtHead(40);
        linkedListD.insertAtHead(50);
        linkedListD.insertAtHead(60);
        linkedListD.display();
    }
}
