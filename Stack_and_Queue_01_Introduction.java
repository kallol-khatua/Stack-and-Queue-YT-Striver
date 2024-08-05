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

    StackNode(int data, StackNode next) {
        this.data = data;
        this.next = next;
    }
}

class StackUsingLinkedList {
    StackNode top = null;
    int size = 0;

    public void push(int n) {
        StackNode temp = new StackNode(n, top);
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

class QueueNode {
    int val;
    QueueNode next;

    QueueNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class QueueUsingLinkedList {
    QueueNode start = null;
    QueueNode end = null;
    int size;

    public void push(int n) {
        if (start == null) {
            QueueNode temp = new QueueNode(n);
            start = temp;
            end = temp;
            size = 1;
        } else {
            QueueNode temp = new QueueNode(n);
            end.next = temp;
            end = temp;
            size++;
        }
        System.out.println(n + " added to the queue.");
    }

    public void pop() {
        if (start != null) {
            int data = start.val;
            QueueNode next = start.next;
            start.next = null;
            start = next;
            size--;
            System.out.println("Element is popped = " + data);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void peek() {
        if (start != null) {
            System.out.println("Peek element is = " + start.val);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void size() {
        System.out.println("Size of the queue " + size);
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
//        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
//        stackUsingLinkedList.peek();
//        stackUsingLinkedList.pop();
//        stackUsingLinkedList.push(4);
//        stackUsingLinkedList.push(1);
//        stackUsingLinkedList.push(3);
//        stackUsingLinkedList.push(9);
//        stackUsingLinkedList.size();
//        stackUsingLinkedList.peek();
//        stackUsingLinkedList.pop();
//        stackUsingLinkedList.size();
//        stackUsingLinkedList.push(8);
//        stackUsingLinkedList.push(10);
//        stackUsingLinkedList.push(2);
//        stackUsingLinkedList.size();


//        implementation of stack using queue
//        Leetcode -  225. Implement Stack using Queues


//        TODO: DUE:
//        implementation of queue using array


//        implementation of queue using linked list
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.peek();
        queueUsingLinkedList.pop();
        queueUsingLinkedList.push(4);
        queueUsingLinkedList.push(1);
        queueUsingLinkedList.push(3);
        queueUsingLinkedList.push(9);
        queueUsingLinkedList.size();
        queueUsingLinkedList.peek();
        queueUsingLinkedList.pop();
        queueUsingLinkedList.size();
        queueUsingLinkedList.peek();
        queueUsingLinkedList.push(8);
        queueUsingLinkedList.push(10);
        queueUsingLinkedList.push(2);
        queueUsingLinkedList.size();



//        implementation of queue using stack
//        Leetcode - 232. Implement Queue using Stacks
    }
}
