package Arrays;
import  java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] nums = {4,3,2,5,6,7};
        Arrays.sort(nums);


        Character [] characters = { 'A','Z','G','f','g','a','r','b','z'};
        Arrays.sort(characters);

        //print output
        printArray(nums);
        printArray(characters);

        //sort a part of the array (from index, to index -1 )
        Integer []  numbers = {34, 45,67,78,89,45,23,3,2,11,0,-1};
        Arrays.sort(numbers, 5,12);
        printArray(numbers);

        //sorting strings
        String [] string = {"hello", "griffindor", "welcome", "to", "hogwarts"};
        Arrays.sort(string);
        printArray(string);

        //search method, first the array must be sorted
        //return value ---> returns index of the element if exists
        Integer key1 = 4;
        Integer myIndex = Arrays.binarySearch(nums,key1);
        if ( myIndex >= 0){
            System.out.println("Element found at index: " + myIndex);

        } else {
            System.out.println("element not found");
        }

    }

    //using generic types to print out the array
    public static <T> void printArray( T [] array){
        Arrays.stream(array).forEach(item -> System.out.print(item + " "));
        System.out.println();

    }
}
