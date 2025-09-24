package ProblemSolving;
import java.io.*;
import java.util.*;



public class FindLastDigitOfNumber {
    
    public static void main(String[] args) {
        System.out.println("Program to find last digit of number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int lastDigit = num%10;
        System.out.println("Last digit of the number "+num+" is: "+lastDigit);

        String numStr = Integer.toString(num);             // Convert number to string
        char lastChar = numStr.charAt(numStr.length() - 1); // Get last character
        int lastDigit = Character.getNumericValue(lastChar); // Convert char to int

    }
}

