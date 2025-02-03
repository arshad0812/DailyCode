import java.util.*;

public class MultiplesOfTwoNumberWithinN {
    public static void main(String[] args) {
        long n1 = 3; // First number
        long n2 = 5; // Second number
        long n3 = n1 * n2; // Least Common Multiple (LCM), assuming n1 and n2 are coprime
        long n = 100; // Limit (upper boundary for multiples)

        // Calculate number of multiples for n1, n2, and n3 below n
        long div1 = (n - 1) / n1;
        long div2 = (n - 1) / n2;
        long div3 = (n - 1) / n3;

        // Calculate the sum of multiples
        long sum = 0;
        sum += n1 * (div1 * (div1 + 1)) / 2; // Sum of multiples of n1
        sum += n2 * (div2 * (div2 + 1)) / 2; // Sum of multiples of n2
        sum -= n3 * (div3 * (div3 + 1)) / 2; // Subtract common multiples of n1 and n2

        // Output the result
        System.out.println("Sum of multiples: " + sum);
    }
}


//output
// sum of multiples : 2318