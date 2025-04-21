package Arrays;

import java.awt.*;
import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {

        Integer [] numbers1 = {1,2,3,4,5,6,7,8};
        Integer [] numbers2 = {11,22,33,44,55,66,77,88};
        Integer [] numbers3 = {8,7,6,5,4,3,2,1};

        //array of objects
        String [] string1 = {"abc","def","ghi"};
        String [] string2= {"abc","def","ghi"};

        //comparing objects
        String str1 = new String("hello");
        String str2 = new String("hello");

        //using the equals() method;
        System.out.println(Arrays.equals(numbers1,numbers2));//returns false
        System.out.println(Arrays.equals(numbers1,numbers3)); //returns false
        System.out.println(Arrays.equals(string1,string2)); //returns true
        System.out.println(Arrays.equals(string1,1,2,string2,1,2)); //returns true

        //comparing objects
        System.out.println(str1 == str2); //returns false becasue its compares the adress
        System.out.println(str1.equals(str2)); //returns true
        if (str2.equals(str1)){
            System.out.println("The objects are  equal to each other");
        } else {
            System.out.println("The  objects are not equal");
        }

        //comparing points
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);
        if(point2 == point1){
            System.out.println("==  operator compares adresses ");
        } else  if (point2.equals(point1)){
            System.out.println("Object comparison");
        }
        System.out.println(point1 == point2); //false
        System.out.println(point1.equals(point2)); //true

    }
}
