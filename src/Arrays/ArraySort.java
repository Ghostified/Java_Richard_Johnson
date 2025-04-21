package Arrays;
import  java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] nums = {4,3,2,5,6,7};
        Arrays.sort(nums);


        Character [] characters = {'f','g','a','r','b','z'};
        Arrays.sort(characters);

        //print output
        printArray(nums);
        printArray(characters);

    }

    //using generic types to print out the array
    public static <T> void printArray( T [] array){
        Arrays.stream(array).forEach(item -> System.out.print(item + " "));
        System.out.println();

    }
}
