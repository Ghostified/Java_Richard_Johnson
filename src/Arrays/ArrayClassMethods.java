package Arrays;

import java.util.Arrays;

public class ArrayClassMethods {
    public static void main(String[] args) {
        Integer [] num1 = new Integer[5];
        Arrays.fill(num1, 3);
        printArray(num1);

        Integer [] num2 = new Integer[8];
        Arrays.fill(num2, 4,8,9);
        printArray(num2);

        String [] str1 = new String[ 10];
        Arrays.fill(str1, "Hogwarts");
        printArray(str1);
        Arrays.fill(str1,5,8, "hello Branson");
        printArray(str1);

        //toString method returning a string representation of an array
        System.out.println(Arrays.toString(str1));

    }

    public static  <T> void printArray( T [] array){
        for(Integer i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
