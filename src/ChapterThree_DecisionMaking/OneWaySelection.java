package ChapterThree_DecisionMaking;

import javax.swing.*;

/*
* One way selection is an If statement..
* if a condition is true, a certain sequence of actions is performed
* Because there is only one way to deviate from the normal sequence of program statements
* the if - else statement is a two way selection where if the first condition or block in the if statement is not met
* the block of code in the else statement gets executed
* */
public class OneWaySelection {
    public static void main(String[] args) {
        String message = "Enter your annual income in $: ";
        String incomeString = JOptionPane.showInputDialog(message);
        int income = Integer.parseInt(incomeString);
        double federalTaxRate , stateTaxRate ,localTaxRate ;
        if (income > 5000){
             federalTaxRate = .20;
             stateTaxRate = .10;
             localTaxRate = .05;
        }
        // the alternative - second selection
        else{
            federalTaxRate = 0.10;
            stateTaxRate = .05;
            localTaxRate = 0.025;
        }
//        String outputMessage;
//        String taxesString =JOptionPane.showMessageDialog(outputMessage);
    }
}
