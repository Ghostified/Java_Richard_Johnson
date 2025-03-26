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

        //return value of a binarySearch when an element is not found
        // (insertionIndex + 1) --> RETURN VALUE WHEN AN ELEMENT IS NOT FOUND
        System.out.println(" ");

        //1: array declaration with type safety
        Integer [] myNumbers = {9,6,2,8,4,7,3,5,1};

        //2: sort and print sorted array
        Arrays.sort(myNumbers);
        System.out.println("The sorted array is : ");
        printArray(myNumbers);


        //3: perform binary search
        int myKey = 10;
        int myIndex = Arrays.binarySearch(myNumbers, myKey);

        //4: print out the element
        if (myIndex >= 0 ){
            System.out.println("Element: " + myKey + " found at index: " + myIndex);
        }else {
            System.out.println("Element: " + myKey  + " not found, But can be inserted to: " + myIndex); //returns -10
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
