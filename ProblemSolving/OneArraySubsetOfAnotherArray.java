import java.util.Arrays;
import java.util.HashSet;


public class OneArraySubsetOfAnotherArray {

    public static boolean ArraySubset(int arr[],int brr[]){
        
        HashSet<Integer> hs=new HashSet<Integer>();
        
        for(int num:arr){
            hs.add(num);
        }


        for(int num:brr){
            if(!hs.contains(num)){
                return false;
            }   
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] array2={3,1,2,10};
        if(ArraySubset(array,array2)){
            System.out.println("Is a Subset");
        }
        else{
            System.out.println("Not a Subset");
        }

    }
}


// output
//A subset means that every element of the second array (brr[]) must also be present in the first array (arr[]).
// Not a Subset {
    

