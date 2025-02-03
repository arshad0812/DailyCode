import java.util.Scanner;

public class PrimeNumbers {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to print all prime numbers up to a given limit
    public static void printPrimes(int limit) {
        System.out.print("Prime numbers up to " + limit + ": ");
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Program to find prime numbers");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        
        printPrimes(limit);
        
        scanner.close();
    }
}