import java.util.Scanner;

public class ArmstrongNumber {
    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0, temp = num;
        
        // Count number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        
        temp = num;
        
        // Calculate sum of each digit raised to the power of total digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == originalNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
