package ChapterThree_DecisionMaking;

import javax.swing.*;

public class SwitchCase {
    public static void main(String[] args) {
        String message = "Enter your income bracket: \n"
                + "1, for greater than $50,000 per year: \n "
                + " 2, for $25000 through $50,000 \n"
                + "3 ,Up to and and including 25,000 per year";

        String incomeBracketString = JOptionPane. showInputDialog(message);

        int incomeBracket = Integer.parseInt(incomeBracketString);

        switch (incomeBracket)
        {
            case incomeBracket : 1
                double federalTax = .20;
                double stateTax = .10;
                double localTax = .05;
                break;
            case incomeBracket : 2
                 federalTax = .10;
                stateTax = .05;
                localTax = .025;
                break;
            case incomeBracket : 3
                 federalTax = .05;
                 stateTax = .025;
                 localTax = .0125;
                break;
            default:
                JOptionPane.showMessageDialog("Invalid Entry");
                System.exit(0);
        }

    }
}
