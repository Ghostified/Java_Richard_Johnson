package Arrays;

/*
* program that displays the sum , product and average of an array*/

public class SumProductAverage {
    public static void main(String[] args) {
        int nums [] = {-2,3,5,8};
        System.out.println(calculateSum(nums));
        System.out.println(calculateProduct(nums));
        System.out.println(calculateAverage(nums));
    }

    public static int calculateSum( int array []){

        int sum = 0 ;
        for (int i = 0; i < array.length; i++){

            sum = sum + array[i];
        }
        return sum;
    }

    public  static int calculateProduct ( int array []){
        int product = 1;
        for (int i =0 ; i < array.length; i++){
            product = product * array[i];
        }

        return product;
    }

    public  static double calculateAverage (int array []){
        double sum = 0 ;
        int counter = 0;
        for (int i =0; i<  array.length; i++){
            sum = sum + array[i];
            counter++;
        }

        double average = sum / counter;
        return average;
    }
}
