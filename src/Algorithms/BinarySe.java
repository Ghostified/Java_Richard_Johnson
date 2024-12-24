package Algorithms;

public class BinarySe {

    public static void main(String[] args) {

        int [] arrays = {3,4,5,6,7,8,9,};
        System.out.println(binarySearch(arrays, 5));

    }

    private static int binarySearch(int [] numbers, int searchItem) {

        int left = 0;
        int right = numbers.length -1;

        while (left <= right){
            int midPoint = (left + right ) /2 ;
            int middleNumber = numbers[midPoint];

            if (searchItem == middleNumber) {
                return midPoint;
            }

            if ( searchItem < middleNumber) {
                right = midPoint - 1;
            }
            else  {

                left = midPoint + 1 ;
            }
        }
        return  -1;
    }
}
