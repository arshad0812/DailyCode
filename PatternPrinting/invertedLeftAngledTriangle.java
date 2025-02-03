import java.util.*;
import java.io.*;

public class invertedLeftAngledTriangle {

    public static void main(String args[]){
        System.out.println("Program to print Inverted left Triangle");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
