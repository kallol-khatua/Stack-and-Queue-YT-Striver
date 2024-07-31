import java.util.Stack;

public class stack_and_Queue_07_previous_smaller_element {
    private static void printOneDArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 3, 9};
        printOneDArray(arr);

//        using the concept of monotonic stack
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int currVal = arr[i];
            while(!st.isEmpty() && currVal <= st.peek()) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
                st.push(currVal);
            } else {
                ans[i] = st.peek();
                st.push(currVal);
            }
        }

        printOneDArray(ans);
    }
}
