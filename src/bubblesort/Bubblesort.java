package bubblesort;

import java.util.Arrays;

public class Bubblesort {
    
    public static void main(String[] args) {
      String[]strArray = { "Dog", "Cat", "Monkey", "Alieza"};
      System.out.println("Orig String Array:" + Arrays.toString(strArray));
      bubblesort(strArray);
       System.out.println("sorted String Array:" + Arrays.toString(strArray));
      
    }
    
    static void bubblesort(String [] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n-i - 1; j++){
        if (arr[j].compareTo(arr[j + 1])> 0){
            String temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            
        }
    }
    }
    }
}
