import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class IntersectionOfArrays {

    // Method to find the intersection of two arrays
    public static int[] intersection(int[] arr1, int[] arr2) {
        // Create a HashSet to store elements of the first array
        Set<Integer> set1 = new HashSet<>();

        // Add elements from the first array to the HashSet
        for (int num : arr1) {
            set1.add(num);
        }

        // Create a list to store the intersection results
        ArrayList<Integer> resultList = new ArrayList<>();

        // Iterate over the second array and check if elements are in the set1
        for (int num : arr2) {
            if (set1.contains(num)) {
                resultList.add(num);
                set1.remove(num);  // Remove to avoid duplicates in the intersection
            }
        }

        // Convert the result list to an array
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 4};
        int[] arr2 = {2, 2, 3, 4};

        // Find the intersection of the two arrays
        int[] result = intersection(arr1, arr2);

        // Print the result
        System.out.print("Intersection of the two arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
