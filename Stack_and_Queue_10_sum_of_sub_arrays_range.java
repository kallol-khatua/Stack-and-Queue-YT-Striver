import java.util.Stack;

public class Stack_and_Queue_10_sum_of_sub_arrays_range {
    private static int[] nse(int[] arr) {
        int size = arr.length;
        int[] ans = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = size - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? size : st.peek();
            st.push(i);
        }

        return ans;
    }

    private static int[] psee(int[] arr) {
        int size = arr.length;
        int[] ans = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < size; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    private static int findSumOfSubArraysMinimum(int[] arr) {
        int[] nse = nse(arr);
        int[] psee = psee(arr);

        int sum = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < arr.length; i++) {
            int left = i - psee[i];
            int right = nse[i] - i;

            int mul = (left * right) % mod;

            int con = (mul * arr[i]) % mod;
            sum = (sum + con) % mod;
        }

        return (int) sum;
    }

    private static int[] nge(int[] arr) {
        int size = arr.length;
        int[] ans = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = size - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? size : st.peek();
            st.push(i);
        }

        return ans;
    }

    private static int[] pgee(int[] arr) {
        int size = arr.length;
        int[] ans = new int[size];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < size; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return ans;
    }

    private static int findSumOfSubArraysMaximum(int[] arr) {
        int[] nge = nge(arr);
        int[] pgee = pgee(arr);

        int sum = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < arr.length; i++) {
            int left = i - pgee[i];
            int right = nge[i] - i;

            int mul = (left * right) % mod;

            int con = (mul * arr[i]) % mod;
            sum = (sum + con) % mod;
        }

        return (int) sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 5, 2, 3};
        int maximumSum = findSumOfSubArraysMaximum(arr);
        int minimumSum = findSumOfSubArraysMinimum(arr);

        int ans = maximumSum - minimumSum;

        System.out.println(ans);
    }
}