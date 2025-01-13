package ChapterFour;

import javax.swing.*;

//Take five inputs from a user and sum them up  using a for loop

public class CounterControlledForLoop {
//    public static void main(String[] args) {
//        String numberString;
//        double number, total = 0;
//        final int n = 5;
//
//        for (int i = 0; i < n ; i++ ){
//            numberString = JOptionPane.showInputDialog("Enter a  number:? ");
//            number = Double.parseDouble(numberString);
//            total += number;
//        }
//        JOptionPane.showMessageDialog(null, "The total is : " + total);
//        System.exit(0);
//    } //end main
public static void main(String[] args) {
    String numberString;
    double number, total = 0;
    final int n = 5;

    for (int i = 0; i < n ; i++ ){
        numberString = JOptionPane.showInputDialog("Enter a  number:? ");
        number = Double.parseDouble(numberString);
        total += number;
    }
    JOptionPane.showMessageDialog(null, "The total is : " + total);
    System.exit(0);
}
}//end class
