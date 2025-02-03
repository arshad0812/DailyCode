import java.util.*;
import java.io.*;

public class ReverseDigitsInNumber {

    public static int ReverseDigits(int num){
        int reversenum = 0;
        while(num!=0){
            int digit=num%10;
            reversenum=reversenum*10+digit;
            num=num/10;
        }
        return reversenum;
    }

    public static void main(String[] args) {
        System.out.println("Program to reverse digits in number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();


        int reversenum=ReverseDigits(num);
        System.out.println("Reversed number: "+reversenum);
    }
}
