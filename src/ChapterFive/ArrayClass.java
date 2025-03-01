package ChapterFive;

import java.util.Arrays;

public class ArrayClass {
    //Array class contains static methods taht are used by arrays
    //eg : search, sort , compare , filling and return string representation of arrays

    //sort method sorts an array
    public static void main(String[] args) {
        int [] numbers= { 71,26, 302 ,3,64,5,65, 78,99,};
        //Arrays.sort(numbers);
        //printArray(numbers);


        //sorting part of an array using indices
        Arrays.sort(numbers, 3,5);
        printArray(numbers);

    }

     public static void printArray( int [] numbers){
        for (int i = 0; i < numbers.length; i++ ){
            System.out.println(numbers [i]);
        }
    }

}
