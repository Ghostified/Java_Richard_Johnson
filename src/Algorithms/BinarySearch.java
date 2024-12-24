package Algorithms;

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,7,8,9,10,12,13};

        System.out.println(binarySearch(array,1));

    }

    private static int binarySearch( int numbers[], int toFind){

      //create two pointers : left-pointer and  right-pointer
        //find the midpoint of the array
        //check if the midpoint == number to find, return the index
        //if the midpoint < than the number to find
          // make the right-pointer to move left of the midpoint
        //if the  number to find is greater than the midpoint, the left-pointer moves right of the mid-point

        int low = 0;
        int high = numbers.length -1;

        while (low <= high) {
            int midPosition = (low + high) /2;
            int middleNumber = numbers[midPosition];

            if(toFind == middleNumber){
               return midPosition;
            }
            if (toFind < middleNumber){
                high = midPosition -1;
            } else {
                low = midPosition + 1;
            }

        }

        return  -1;
    }
}
