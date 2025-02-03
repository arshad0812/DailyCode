import java.util.HashSet;
import java.util.Set;

public class UnionOfArrays {

    // Method to find the union of two arrays
    public static int[] union(int[] arr1, int[] arr2) {
        // Create a HashSet to store the union of both arrays
        Set<Integer> set = new HashSet<>();

        // Add elements from the first array to the HashSet
        for (int num : arr1) {
            set.add(num);
        }

        // Add elements from the second array to the HashSet
        for (int num : arr2) {
            set.add(num);
        }

        // Convert the HashSet to an array and return it
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        // Find the union of the two arrays
        int[] result = union(arr1, arr2);

        // Print the result
        System.out.print("Union of the two arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
