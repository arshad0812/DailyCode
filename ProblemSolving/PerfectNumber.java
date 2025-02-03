import java.util.*;
import java.io.*;


public class PerfectNumber {

    public static void main(String args[]){
        System.out.println("Program to find Perfect Number");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number of rows:");
        int num=sc.nextInt();
        int sum=0;
        System.out.println("Sum of divisors of i : ");
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
            {
                sum+=i;
                System.out.print(i+",");
            }
            
        }
        System.out.println();


        if(sum==num){
            System.out.println(num + " is a perfect Number.");
        }
        else{
            System.out.println(num + " is not a perfect Number.");
        }
    }
}

//output
// Enter a number of rows:
// 6
// Sum of divisors of i :
// 1,2,3,
// 6 is a perfect Number