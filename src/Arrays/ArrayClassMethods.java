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
    }

    public static  <T> void printArray( T [] array){
        for(Integer i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
