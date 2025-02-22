import java.util.Scanner;

public class abundantNumber {
    
    // Method to find the sum of proper divisors
    public static int sumOfDivisors(int num) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i; // i is a divisor
                if (i != num / i) { // To avoid adding the square root twice
                    sum += num / i; // num / i is also a divisor
                }
            }
        }
        return sum;
    }

    // Method to check if a number is abundant
    public static boolean isAbundant(int num) {
        return sumOfDivisors(num) > num; // Abundant if the sum of divisors is greater than the number
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is abundant
        if (isAbundant(number)) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is not an abundant number.");
        }

        scanner.close();
    }
}

//OUTPUT
//Enter a number: 12
//12 is an abundant number.
//
//Enter a number: 10
//10 is not an abundant number.