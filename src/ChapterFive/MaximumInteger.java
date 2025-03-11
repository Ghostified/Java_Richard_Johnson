package ChapterFive;

public class MaximumInteger {
    public static void main(String[] args) {
        String result;

        result = findMax(2, 3);
        System.out.println(result);

        result = findMax(7,9);
        System.out.println(result);

    } //end main

    public  static String findMax(int firstInt, int secondInt){
        int largestInt;
        String outputString;

        if (firstInt >= secondInt) {
            largestInt = firstInt;
        }
        else{
            largestInt = secondInt;
        }

        outputString = "The largest of \n"
                 + firstInt + " and " + secondInt + " \n"
                + " is " + largestInt + "\n";
        return outputString;
    } //end of findMax() method
} //end of class
