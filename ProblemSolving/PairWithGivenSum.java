import java.util.*;
import java.io.*;



public class PairWithGivenSum {
    
    public static boolean FindPair(int arr[],int sum){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int target=sum-arr[i];
            if(set.contains(target)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
        
    }

    public static void main(String args[]){
        System.out.println("Program to find pair with given sum");
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        sc.close();



        int arr[]={0, -1, 2, -3, 1};
        if(FindPair(arr,sum)){
            System.out.println("Pair found");
        }
        else{
            System.out.println("Pair not found");
        }


    }
}
