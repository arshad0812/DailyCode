import java.util.Scanner;
import java.io.*;


public class RecursiveBasic1 {


    static void RecurMethod(int num){
        if(num==0){
            return;
            
        }
        System.out.println(num--);
        RecurMethod(num); 

    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        RecurMethod(num);
    }
}
