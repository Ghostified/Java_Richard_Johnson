package ChapterFive;

import java.util.Scanner;

public class RoundOff {
    public static void main(String[] args) {
        double value, precision, roundedValue;
        String openingMsg = "Program to round off input value";
        String output;
        Scanner input = new Scanner(System.in);

        //input
        System.out.println(openingMsg);
        System.out.print("Enter value to be rounded:");
        value = input.nextDouble();
        System.out.println("Enter the desired precision");
        precision = input.nextDouble();

    }
}
