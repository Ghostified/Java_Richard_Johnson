package Arrays;

import java.util.Arrays;

//fill( array, value);
public class ArraysFillMethod {
    public static void main(String[] args) {
        Integer numbers [] = new Integer [10];
        Arrays.fill(numbers);
        printArray(numbers);


    }

    public static <T>  void printArray(T Array [] ){
        for (int i = 0; i < Array.length; i++)
        {
            System.out.println( Array [i] + " ");
        }

    }

}
