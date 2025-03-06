package ChapterFive;
import java.text.NumberFormat;
import java.util.Scanner;

public class NumberFormartting {
    public static void main(String[] args) {

        //getNumberInstance - Returns a Number Formart object for General number Formarting

        //variables
        double value;
        int numOfDecimals;
        String openingMessage = "This program rounds off the inputted value \n";
        String roundedValueStr, output;
        Scanner input = new Scanner(System.in);

        //input
        System.out.println(openingMessage);
        System.out.println("Enter a value to be rounded:  ");
        value = input.nextDouble();
        System.out.println("Enter the desired number of decimal places: " );
        numOfDecimals = input.nextInt();

        //processing
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(numOfDecimals);
        roundedValueStr = nf.format(value);

        //output
        output = "\nThe Value " + value + "\n"
                + " rounded off to " + numOfDecimals + " decimal places \n"
                + " is " + roundedValueStr + " \n\n";
        System.out.println(output);

    } //end of main method

} //end of class
