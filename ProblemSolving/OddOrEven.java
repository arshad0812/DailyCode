import java.io.*;
import java.util.*;

public class OddOrEven{
    public static void main(String[] args){
        System.out.println("Program to odd or even number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is an even number");
        }
        else{
            System.out.println(num+" is an odd number");
        }

    }
}