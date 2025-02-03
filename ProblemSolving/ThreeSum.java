import java.io.*;
import java.util.*;



public class ThreeSum{

    public static boolean PairWithGivenSum(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;


            while(l<r){
                int cursum=arr[i]+arr[l]+arr[r];

                if(cursum==target){
                    return true;
                }
                else if(cursum<target){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int[] arr = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        Arrays.sort(arr);
        if(PairWithGivenSum(arr,sum)){
            System.out.println("Pair found with given sum");
        }
        else{
            System.out.println("No pair found with given sum");
        }
    }
}



