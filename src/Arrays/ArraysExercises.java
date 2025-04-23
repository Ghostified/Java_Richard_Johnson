package Arrays;

/*program that fils ana array with n integers entered by the user
program that fils ana array with n points entered by the user
* n can be between 0 and 20
* */

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of elements ? (maximum of 20): ");
        int n = input.nextInt();

        while ( n > 20 || n <= 0){
            System.out.println("Invalid number, try again: ");
            n = input.nextInt();
        }

        int [] numbers = new int [n];
        fillArrayOfIntegers(numbers);
        printArray(numbers);

        System.out.println("Enter a number of elements ? (maximum of 20): ");
        int y = input.nextInt();

        while ( y > 20 || y <= 0){
            System.out.println("Invalid number, try again: ");
            y = input.nextInt();
        }

        Point [] myPoints = new Point[ y];
        fillArrayOfPoints(myPoints);
        printPoints(myPoints);



    }

    private static void printPoints(Point[] myPoints) {
        System.out.println("The points elements are: ");
        for (int i = 0; i < myPoints.length; i++){
            System.out.println("(" + myPoints[i].x + " , " + myPoints[i].y + ")");
        }
    }

    private static void fillArrayOfPoints(Point[] myPoints) {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i< myPoints.length; i++){
            System.out.print("Enter x and y: " + (i + 1) + " ");
            myPoints[i] = new Point(input.nextInt(), input.nextInt());
        }

    }

    private static void printArray(int[] numbers) {
        System.out.println("The numbers are: ");
        System.out.println(Arrays.toString(numbers));
    }

    private  static void fillArrayOfIntegers (int [] numbers){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
    }



}
