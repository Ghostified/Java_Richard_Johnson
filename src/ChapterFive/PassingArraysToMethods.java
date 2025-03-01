package ChapterFive;

public class PassingArraysToMethods {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        change(numbers);
        printArray(numbers);


    }

    public  static void change (int [] numbers) {
        numbers [0] = 10;
        numbers [1] = 20;
    }

    public  static void printArray(int [] numbers) {
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
    }
}
