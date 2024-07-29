class StackUsingArray {
    private int top;
    private final int size;
    private final int[] arr;

    StackUsingArray(int size) {
        this.top = -1;
        this.size = size;
        arr = new int[size];
    }

    public void push(int n) {
        top++;
        if (top < size) {
            arr[top] = n;
            System.out.println(n + " added to the stack");
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element of stack is = " + arr[top]);
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Peek element of stack is = " + arr[top]);
        }
    }

    public void size() {
        System.out.println("Size of the stack " + size);
    }
}

class StackNode {
    int data;
    StackNode next;

    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackUsingLinkedList {
    StackNode top = null;
    int size = 0;

    public void push(int n) {
        StackNode temp = new StackNode(n);
        temp.next = top;
        top = temp;
        size++;
        System.out.println(n + " added to the stack");
    }

    public void pop() {
        if (top != null) {
            int data = top.data;
            StackNode temp = top;
            top = top.next;
            temp.next = null;
            size--;
            System.out.println("Element is popped = " + data);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void peek() {
        if (top != null) {
            System.out.println("Peek element is = " + top.data);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void size() {
        System.out.println("Size of the stack " + size);
    }
}

public class Stack_and_Queue_01_Introduction {
    public static void main(String[] args) {
//        implementation of stack using array

//        StackUsingArray stackUsingArray = new StackUsingArray(5);
//        stackUsingArray.peek();
//        stackUsingArray.pop();
//        stackUsingArray.push(4);
//        stackUsingArray.push(1);
//        stackUsingArray.push(3);
//        stackUsingArray.push(9);
//        stackUsingArray.peek();
//        stackUsingArray.pop();
//        stackUsingArray.push(8);
//        stackUsingArray.push(10);
//        stackUsingArray.push(2);
//        stackUsingArray.size();


//        implementation of stack using linked list
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.peek();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.push(4);
        stackUsingLinkedList.push(1);
        stackUsingLinkedList.push(3);
        stackUsingLinkedList.push(9);
        stackUsingLinkedList.size();
        stackUsingLinkedList.peek();
        stackUsingLinkedList.pop();
        stackUsingLinkedList.size();
        stackUsingLinkedList.push(8);
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(2);
        stackUsingLinkedList.size();


//        TODO:
//        implementation of stack using queue

//        TODO:
//        implementation of queue using array

//        TODO:
//        implementation of queue using linked list

//        TODO:
//        implementation of queue using stack
    }
}
