import java.util.*;
import java.io.*;

public class InvertedRightAngledTriangle {
    public static void main(String args[]){
        System.out.println("Program to print Inverted Right angled Triangle");


        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
