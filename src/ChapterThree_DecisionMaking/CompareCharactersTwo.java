package ChapterThree_DecisionMaking;

import javax.swing.*;

public class CompareCharactersTwo {
    public static void main(String[] args) {
        String valueOne, valueTwo;

        String instructions = "Enter two characters";
        JOptionPane.showMessageDialog(null,instructions);

        valueOne = JOptionPane.showInputDialog("Enter the first value");
       valueTwo = JOptionPane.showInputDialog("Enter a second value");


     Integer result = valueTwo.compareTo(valueOne);
     JOptionPane.showMessageDialog(null,result);


    }
}
