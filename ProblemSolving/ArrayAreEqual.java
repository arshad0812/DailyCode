import java.util.*;

public class ArrayAreEqual
{

    public static boolean CheckBothAreEqual(int arr[],int brr[]){
        Arrays.sort(arr);
        Arrays.sort(brr);
        return Arrays.equals(arr,brr);
    }


public static void main(String []args)
{
  
    int[] array = {1, 3, 4, 2, 5};
    int[] array2={5, 4, 3, 2, 1,6};
    
    if(CheckBothAreEqual(array, array2)){
        System.out.println("Both are equal");
    }
    else{
        System.out.println("Not Equal");
    }
}
}

// Output
// Not Equal