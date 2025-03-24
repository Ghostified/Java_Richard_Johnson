package Arrays;

import java.util.Arrays;

public class ArrayClassInJava {
    public static void main(String[] args) {
        //static methods in the Array class
        //sort(array): sort  the array
        int numbers [] = {2,4,5,6,7,8,9,75};
        Arrays.sort(numbers);
        printArray(numbers);

        int character [] = {'a','c','d','b','B','A','C','D'};
        Arrays.sort(character);
        printArray(character);
    }
    public static void printArray( int [] arrays){
        for (int array : arrays) {
            System.out.println(array + " ");
        }
    }
}
