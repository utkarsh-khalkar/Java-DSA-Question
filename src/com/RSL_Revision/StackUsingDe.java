package com.RSL_Revision;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDe {
    Deque<Integer> q1 = new LinkedList<>();
    Deque<Integer> q2 = new LinkedList<>();

    public void push(int val) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(val); // Add the new element to q1
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    public int peek() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty..");
            return -1;
        }
        return q1.peek();
    }

    public int pop() {
        if (q1.isEmpty()) {
            System.out.println("Stack is Empty..");
            return -1;
        }
        return q1.pop();
    }

    public static void main(String[] args) {
        StackUsingDe s = new StackUsingDe();
        s.push(12);
        s.push(34);
        s.push(56);
        System.out.println("Peek: " + s.peek()); // Output should be 56
        System.out.println("Pop: " + s.pop());   // Output should be 56
        System.out.println("Peek: " + s.peek()); // Output should be 34
    }
}
