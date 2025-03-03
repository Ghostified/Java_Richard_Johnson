package ChapterFive;

import java.awt.*;

public class MethodsReference {
    public static void main(String[] args) {
        //an object is destroyed when it is no longer referenced by a variable
        Point p = getpoint();
        //System.out.println(p);

        //return
       int [] numbers = getNumbers();
       printArrays(numbers);

    }

    public  static Point getpoint(){
        return  new Point(1,2);
    }

    //returning arrays from methods
    public  static int [] getNumbers(){
        int [] numbers = {1,2,3,4,5,6};
        return numbers;
    }

    public static void printArrays (int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array [i] + " ");
        }

    }
}
