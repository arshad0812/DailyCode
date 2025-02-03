import java.util.*;
import java.io.*;


public class Anagram {
    public static boolean isAnagram(String wrd1, String wrd2){
        if(wrd1.length()!=wrd2.length()){
            return false;
        }
        
        char[] arr1=wrd1.toCharArray();
        char[] arr2=wrd2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

 

    public static void main(String args[]){
        String wrd1="anagram";
        String wrd2="naamarg";

        if(isAnagram(wrd1, wrd2))
        {
            System.out.println("its a anagrams");
        }
        else{
            System.out.println("its not a anagrams");
        }

    }
}

// input
// AbC

//output
// ZyX