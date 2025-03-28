package Arrays;

import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {

        Integer [] numbers1 = {1,2,3,4,5,6,7,8};
        Integer [] numbers2 = {11,22,33,44,55,66,77,88};
        Integer [] numbers3 = {8,7,6,5,4,3,2,1};

        //array of objects
        String [] string1 = {"abc","def","ghi"};
        String [] string2= {"abc","def","ghi"};

        //using the equals() method;
        System.out.println(Arrays.equals(numbers1,numbers2));//returns false
        System.out.println(Arrays.equals(numbers1,numbers3)); //returns false
        System.out.println(Arrays.equals(string1,string2)); //returns true
        System.out.println(Arrays.equals(string1,1,2,string2,1,2)); //returns true


    }
}
