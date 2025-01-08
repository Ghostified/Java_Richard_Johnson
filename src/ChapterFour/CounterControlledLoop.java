package ChapterFour;

import javax.swing.*;

public class CounterControlledLoop {
    public static void main(String[] args) {

        String numberString;
        double total = 0;
        double number = 0;

        int i = 0;
        int n =  5;

        while (i < n){
            numberString = JOptionPane.showInputDialog("Enter a number");
            number = Double.parseDouble(numberString);
             total =+ number;
             i++;
        }

        JOptionPane.showMessageDialog(null, "The total is: " + total);
        System.exit(0);
    }
}
