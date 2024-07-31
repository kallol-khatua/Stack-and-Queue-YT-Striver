import java.util.Stack;

public class Stack_and_Queue_05_next_greater_element_1 {
    private static void printOneDArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 9, 1, 8};
        printOneDArray(arr);

//        using monotonic stack
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int currVal = arr[i];
            while (!st.isEmpty() && currVal >= st.peek()) {
                st.pop();
            }
            if(st.isEmpty()) {
                ans[i] = -1;
                st.push(currVal);
            }else {
                ans[i] = st.peek();
                st.push(currVal);
            }
        }
        printOneDArray(ans);
    }
}
