package Arrays;
/*
* program to find the number of occcurences in an array*/

import org.w3c.dom.ls.LSOutput;

public class NumberOfOccurences {
    public static void main(String[] args) {
        int nums [] = {1,1,1,2,4,5,7,7,8,8};


        int searchElement = 9;

        numberOfOccurences(nums,searchElement);



    }

    private static int numberOfOccurences(int[] nums, int searchElement) {
        int counter = 0;

        for (int i = 0; i< nums.length; i++){
            if (nums [i] == searchElement){
                counter++;
            }

        }

        System.out.println("element occurrence = " + counter);
        return counter;

    }


}