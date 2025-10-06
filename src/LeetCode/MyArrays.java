package LeetCode;

public class MyArrays {
    public static void main(String[] args) {
        int array []= {-1,2,3,4,5,6,7,8,9};
        String[] names = {"James", "Bond", "The"};
        int length = names.length;

        for (String name : names ){
            System.out.println(name);
        }

        for (int  i = 0; i< names.length; i++){
            System.out.println( names[i] + " ");
        }

        System.out.println(findMin(array));

    }
    static void printArray(int [] array) {

    }
    static  int findMin(int [] array ){
        int min = array[0];

        for (int i = 1; i< array.length; i++){

            //compare the min element  === arr[i]
            if ( array [i] < min){
                min = array[i];
            }

        }
        return  min;
    }
}
