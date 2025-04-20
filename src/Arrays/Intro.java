package Arrays;

public class Intro {
    public static void main(String[] args) {

        //array initialization
        int [] numbers = new int[ 5 ];
        numbers [ 0] = 5;
        numbers [1] = 4;
        numbers [2] = 3;
        numbers [4] = 10;

        double [ ] numbersTwo = {3.5,4.5,5.5, 6.7};

//        for (int i = 0; i < numbersTwo.length; i++){
//            System.out.println(numbersTwo[i] + " ");
//        }

        //int [] numbersThree = {1,2,3,4,5};
        printArray(new Integer[] {1,2,3,4,5});

        //Arrays are passed by reference
        Integer [] number  = { 0, 1};
        change(number);
        printArray(number);



    }
    public  static  <T> void printArray( T Array []){
        for (int i = 0; i < Array.length; i++){
            System.out.println(Array[i]);
        }
    }

    public static void change (Integer [] Arrays){
        Arrays[0] = 1;
        Arrays[1] = 0;
    }

}
