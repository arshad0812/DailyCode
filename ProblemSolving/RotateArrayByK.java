import java.util.Arrays;

public class RotateArrayByK {

    public static void rotate(int[] arr, int k) {
        
        int n = arr.length;
        k = k % n; // To handle cases where k > n
        System.out.println(k);
        // Step 1: Reverse the entire array
        //7 6 5 4 3 2 1
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first k elements
        //5 6 7 4 3 2 1
        reverse(arr, 0, k - 1);

        // Step 3: Reverse the remaining elements
        //5 6 7 1 2 3 4 
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(array));
        rotate(array, k);
        System.out.println("Rotated Array: " + Arrays.toString(array));
    }
}


// output

// Original Array: [1, 2, 3, 4, 5, 6, 7]
// 3
// Rotated Array: [5, 6, 7, 1, 2, 3, 4]