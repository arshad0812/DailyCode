import java.io.*;
import java.util.*;

public class GcdOfTwoNumber{

    public static void main(String args[]){
        System.out.println("program to find gcd of two number");

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            num1=temp;
        }


        System.out.println("Gcd of num1 and num2 is "+num1);


    }

}