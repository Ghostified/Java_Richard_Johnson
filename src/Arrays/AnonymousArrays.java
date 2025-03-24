package Arrays;

public class AnonymousArrays {
    //an array without a variable referencing it.

    public static void main(String[] args) {
        char [] chars = {'a','b','c','d'};


        //pass arrays to methods --> passed as reference
        int [] numbers = {0,1};
        change(numbers);
        printArray(numbers);
       // System.out.println(getNumbers()); ///prints adress in memory
        int [] nums = getNumbers();
        printArray(nums);


    }
    public  static  void change (int [] numbers){
        numbers [ 0] = 20;
        numbers [ 1] = 90;
    }

    //method to print an array
    public  static  void printArray( int [] numbers){
        for (int i =0; i < numbers.length; i++){
            System.out.println(numbers [i] + " ");
        }
    }

    //returning arrays from methods--> returns the adress
    public  static int[] getNumbers(){
        int [] numbers = {1,2,3,4,5};
        return numbers;
    }
}
