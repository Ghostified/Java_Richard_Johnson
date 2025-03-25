package Arrays;

import java.util.Arrays;

//binary search method , firsr the array is sorted in an increasing order then the binarySearch () method is called
//binary search returns the index of the element in the array
 public class SearchAnArray {
    public static void main(String[] args) {

        //step one : declare array
        String myString [] = {"Albus","Percival", "Wulfric", "Dumbledore"};

        //step two: sort array
        Arrays.sort(myString);
        System.out.println("\n Sorted Array: ");
        printArray(myString);

        //Step three : perform a binary search
        String key = "Percival";
        int index = Arrays.binarySearch(myString, key);

        //Step 5: print the result of where the index is found
        if (index >= 0){
            System.out.println("\n Element " + key + " found at index:  " + index);
        }
        else {
            System.out.println("Array element " + key + " has not been found");
        }

    }

    public static  <T> void printArray(T [] Arrays){
        if (Arrays == null){
            System.out.println( "Array is null");
            return;
        }
        for (int i = 0; i < Arrays.length; i++){
            System.out.println(Arrays[i]);
        }

    }
}
