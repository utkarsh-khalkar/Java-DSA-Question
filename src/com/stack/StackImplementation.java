package com.stack;

public class  StackImplementation {
    public static class StackImpl
    {
        public  int top;
        public int maxsize;
        public int[] arr;

        public StackImpl(int size)
        {
            maxsize=size;
            top=-1;
            arr=new int[maxsize];
        }
        public void push(int x)
        {
            if(top>= maxsize-1)
            {
                System.out.println("Stack is Overflow..");
            }else {
                arr[++top]=x;
                System.out.println("Value:"+x+" is inserted into Stack.");
            }
        }
        public int pop()
        {
            if(top<0)
            {
                System.out.println("Stack is Underflow..");
                return -1;
            }else {
                int val=arr[top--];
                System.out.println("Popped value:"+val+" from Stack.");
                return val;
            }
        }
        public int peek()
        {
            if(top<0)
            {
                System.out.println("Stack is Underflow..");
                return -1;
            }else {
                return arr[top];
            }
        }
        public  void printStack()
        {
            if(top<0)
            {
                System.out.println("Stack is Empty..");
            }else {
                System.out.println("Stack Elements are..");
                for (int i=top;i>=0;i--)
                {
                    System.out.print("->"+arr[i]+" ");
                }
            }
        }
        public boolean isEmpty()
        {
            if (top<0)
            {
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        StackImpl stack=new StackImpl(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
//        stack.pop();
//        System.out.println(stack.peek()); ;
//        stack.printStack();
//        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        System.out.println();
        System.out.println(stack.isEmpty());
    }
}
