package Arrays;
/*
To illustrate  a method that takes a variable length/number of arguments list
 */

public class VariableLenghth {
    public static void main(String[] args) {

        System.out.println(sum(1,2,3,4,5) ); //returns 15

        //variable length of arguments list as an array
        int [] nums = {1,2,3,4,5};
        System.out.println( sum(nums)); //returns 15

        //passing and anonymous array
        System.out.println(sum(new  int [] {1,2,3,4,5})); //returns 15

    }

    //variable length of arguments of type int
    public static   int sum(int... numbers ){ //The three dots ... are elipses  a
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }

        return  sum;
    }

    //parsing multiple arguments ina variable length  method
    void print ( String name, double... numbers){

    }


}
