package Arrays;

import java.util.Arrays;

public class ArrayClassInJava {
    public static void main(String[] args) {
        //static methods in the Array class
        //sort(array): sort  the array
        int numbers [] = {2,4,15,6,7,18,92,75};
        //Arrays.sort(numbers);
        //printArray(numbers);

        int character [] = {'a','c','d','b','B','A','C','D'};
        Arrays.sort(character);
        //printArray(character);

        //sort(from index,toindex)
        Arrays.sort(numbers,3,8);
        //printArray(numbers);

        //sorting an array of string
        String stringArray [] = {"Hermione","Granger","Harry", "Potter"};
        Arrays.sort(stringArray);
        printAnyArrayType(stringArray);


    }
    public static void printArray( int [] arrays){
        for (int array : arrays) {
            System.out.println(array + " ");
        }
    }
    //looping through an array using generic types
    public  static <T> void printAnyArrayType( T [] Arrays ){

        if (Arrays == null) {
            System.out.println("The array is null and can not be iterated");
            return;
        }
        for (int i = 0; i< Arrays.length; i++){
            System.out.println(Arrays [i]);
        }
    }
}
