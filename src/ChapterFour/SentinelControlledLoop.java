package ChapterFour;

import javax.swing.*;

/*
* Demonstrating a sentinel controlled looping
* */
public class SentinelControlledLoop {
    public static void main(String[] args) {
        String numberString;
        double  total = 0;
        double number = 0;
        final int SENTINEL = -999; //Named constant
        double counter = 0;

        numberString = JOptionPane.showInputDialog("Enter a number to add, type (-999) to quit: ...");
        number  = Double.parseDouble(numberString);

        while (number != SENTINEL) {
            total += number; //accumulate number to total
            numberString = JOptionPane.showInputDialog("Enter a number to add, -999 to quit: ");
            number = Double.parseDouble(numberString);
            counter++;

        }
        JOptionPane.showMessageDialog(null, "The total is : " +total);
        double average = total / counter;
        JOptionPane.showMessageDialog(null, "The number of loop iterations are: " + counter);
        JOptionPane.showMessageDialog(null, "The average is: " + average);
        System.exit(0);
    } //end Main
} //end class
