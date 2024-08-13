package com.linkedList;

public class SinglyImplementation {
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static class  linkedList{
        Node head=null;
        Node tail=null;
        void insertAtEnd(int data)
        {
            Node temp=new Node(data);

            if(head==null)
            {
                head=temp;
            }else{
                tail.next=temp;

            }
            tail=temp;
        }
        public void display()
        {
            Node temp=head;
            while (temp !=null)
            {
                System.out.print("  "+temp.data);
                temp=temp.next;
            }
        }
        int size()
        {
            Node temp=head;
            int cnt=0;

            while (temp !=null)
            {
                cnt++;
                temp=temp.next;
            }
            return cnt;
        }

        void insertAtHead(int val)
        {
            Node temp=new Node(val);

            if(head==null)
            {
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
        }
    }

    public static void main(String[] args) {
        linkedList li=new linkedList();
        li.insertAtEnd(1);
        li.insertAtEnd(2);
        li.display();
        System.out.println();
        System.out.println("Size of LinkedList="+li.size());

        li.insertAtHead(12);

        li.display();
        li.insertAtEnd(20);
        System.out.println();
        li.display();
        System.out.println();
        System.out.println(li.size());

    }

}
