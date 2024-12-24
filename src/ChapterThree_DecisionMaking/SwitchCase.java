package ChapterThree_DecisionMaking;

import javax.swing.*;

public class SwitchCase {
    public static void main(String[] args) {
        String message = "Enter your income bracket: \n"
                + "1, for greater than $50,000 per year: \n "
                + " 2, for $25000 through $50,000 \n"
                + "3 ,Up to and and including 25,000 per year";

        String defaultMessage = "Invalid Entry";
        String incomeBracketString = JOptionPane. showInputDialog(message);

        double federalTax = 0;
        double stateTax = 0;
        double localTax = 0;


        int incomeBracket = Integer.parseInt(incomeBracketString);

        switch (incomeBracket)
        {
            case 1:
                federalTax = .20;
                stateTax = .10;
                localTax = .05;
                break;
            case 2 :
                 federalTax = .10;
                stateTax = .05;
                localTax = .025;
                break;
            case 3:
                 federalTax = .05;
                 stateTax = .025;
                 localTax = .0125;
                break;
            default:
                JOptionPane. showMessageDialog(null, defaultMessage);
                System.exit(0);
        }

        String resultMessage = String.format( "\nFor your income bracket (%d):\n" +
                                                "Federal tax  %.2f%%\n " +
                                                "State  tax  %.2f%%\n " +
                                                "Local tax  %.2f%% \n "
                                                ,incomeBracket ,
                                                federalTax * 100,
                                                stateTax * 100,
                                                localTax *100
        );

        //double totalTaxes = (localTax%2f * 100) + (stateTax%2f* 100)  + (federalTax%2f * 100);

        //JOptionPane.showMessageDialog(null, totalTaxes);
        JOptionPane.showMessageDialog(null, resultMessage);

    }
}
