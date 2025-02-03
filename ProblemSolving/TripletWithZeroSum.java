public class TripletWithZeroSum {

    // Method to find triplets with zero sum using brute force
    public static void findTriplets(int[] arr) {
        int n = arr.length;
        
        // Triple nested loop to check every combination of three elements
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the sum of arr[i], arr[j], and arr[k] is zero
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("Triplet: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4}; // Example array
        findTriplets(arr);
    }
}
