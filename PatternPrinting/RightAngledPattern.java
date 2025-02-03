import java.io.*;
import java.util.*;


public class RightAngledPattern{
    public static void main(String args[]){
        System.out.println("Program to print Right angled pattern");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}