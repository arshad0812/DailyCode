import java.io.*;
import java.util.*;
    


public class CountOfDigitsinNumber {



    public static void main(String args[]){
        System.out.println("Program to Count Number of  Digits in number");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        while(num!=0){
            count++;
            num=num/10;
        }
        System.out.println("Number of digits in "+temp+" is "+count);
    }
}






