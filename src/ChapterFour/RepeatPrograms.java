package ChapterFour;

import javax.swing.*;

public class RepeatPrograms {
    public static void main(String[] args) {
        String numberString;
        double number, total = 0;

        numberString = JOptionPane.showInputDialog("Enter a number...");
        number = Double.parseDouble( numberString );
        total += number;

        numberString = JOptionPane.showInputDialog("Enter a number...");
        number = Double.parseDouble( numberString );
        total += number;

        numberString = JOptionPane.showInputDialog("Enter a number...");
        number = Double.parseDouble( numberString );
        total += number;

        numberString = JOptionPane.showInputDialog("Enter a number...");
        number = Double.parseDouble( numberString );
        total += number;

        numberString = JOptionPane.showInputDialog("Enter a number...");
        number = Double.parseDouble( numberString );
        total += number;

        JOptionPane.showMessageDialog(null, "The total is: " + total);
        System.exit(0);
    }
}
