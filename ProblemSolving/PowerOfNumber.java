import java.util.*;
import java.io.*;

public class PowerOfNumber{
    public static void main(String[] args){
        System.out.println("Program to find power of number");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the elements x : ");
        int x = scanner.nextInt();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the power of x:");
        int n=sc.nextInt();


        // If the power of x is negative Change it to positive
        int nn=n;
        if(nn<0)
        {
            nn=-1*nn;
        }

        double ans=1.0;

        Handles negative powers:



    //Efficient calculation:

    //It uses exponentiation by squaring:

    //If the power is even, square the base and halve the exponent.

    //If the power is odd, multiply the result by the base and decrease the exponent.
        while(nn>=1){
            if(nn%2==1){
                ans=ans*x;
                nn=nn-1;
            }
            else{
                x=x*x;
                nn=nn/2;
            }
        }

        if(n<0)
        {
            ans=1/ans;
        }


        System.out.println("The result is: "+ans);


    }
}

