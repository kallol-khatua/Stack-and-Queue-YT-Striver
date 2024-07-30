import java.util.Stack;

import static java.lang.Math.max;
import static java.lang.Math.min;

class StackPair {
    int num, min;

    StackPair(int num, int min) {
        this.num = num;
        this.min = min;
    }
}

class MinStackPair {
    Stack<StackPair> st;

    public MinStackPair() {
        st = new Stack<>();
    }

    public void push(int num) {
        int min;
        if (st.isEmpty()) {
            min = num;
        } else {
            min = min(st.peek().min, num);
        }
        st.push(new StackPair(num, min));
    }

    public void pop() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        st.pop();
        System.out.println("Item deleted");
    }

    public void top() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element is = " + st.peek().num);
    }

    public void getMin() {
        if (st.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Min element is = " + st.peek().min);
    }
}

class MinStack {
    Stack<Integer> st;
    int min;

    public MinStack() {
        st = new Stack<>();
        min = Integer.MIN_VALUE;
    }

    public void push(int val) {
        if (st.isEmpty()) {
            min = val;
            st.push(val);
        }
        if (val > min) {
            st.push(val);
        } else {
            st.push(2 * val - min);
            min = val;
        }
    }

    public void pop() {
        int top = st.peek();
        if (top > min) st.pop();
        else {
            min = 2 * min - top;
            st.pop();
        }
    }

    public int top() {
        int top = st.peek();
        return max(top, min);
    }

    public int getMin() {
        return min;
    }
}

public class Stack_and_Queue_04_min_stack {
    public static void main(String[] args) {
//        storing val, and min together in stack
//        MinStackPair minStackPair = new MinStackPair();
//        minStackPair.top();
//        minStackPair.pop();
//        minStackPair.push(4);
//        minStackPair.push(5);
//        minStackPair.push(3);
//        minStackPair.getMin();
//        minStackPair.push(9);
//        minStackPair.getMin();
//        minStackPair.top();
//        minStackPair.pop();
//        minStackPair.push(8);
//        minStackPair.push(10);
//        minStackPair.getMin();
//        minStackPair.push(2);
//        minStackPair.getMin();

//        using O(1) time-complexity and without any extra space
//        pop, top and getMin applied on non-empty stack
        MinStack minStack = new MinStack();
        minStack.push(4);
        minStack.push(5);
        minStack.push(3);
        System.out.println(minStack.getMin());
        minStack.push(9);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        minStack.push(8);
        minStack.push(10);
        System.out.println(minStack.getMin());
        minStack.push(2);
        System.out.println(minStack.getMin());
    }
}
