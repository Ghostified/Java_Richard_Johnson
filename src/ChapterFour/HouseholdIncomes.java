package ChapterFour;

import javax.swing.*;

public class HouseholdIncomes {
    public static void main(String[] args) {
        int numberOfEntries = 0;
        double income, totalIncome = 0 , maxIncome , minIncome ,avgIncome;
        String incomeString, openingMsg, closingMsg;

        openingMsg = "This Program shows the income of the household";
        JOptionPane.showMessageDialog(null, openingMsg);

        incomeString = JOptionPane.showInputDialog("Enter a new income or (999 to quit): ");
        income = Double.parseDouble(incomeString);

        maxIncome = income;
        minIncome = income;

        while (income != 999){
            totalIncome += income;

            if (income > maxIncome){
                maxIncome = income;
            } if (income < minIncome){
                minIncome = income;
            }

            numberOfEntries++;

            incomeString = JOptionPane.showInputDialog("Enter a new income or (999 to quit): ");
            income = Double.parseDouble(incomeString);
        }

        //show output
        if (numberOfEntries == 0){
            JOptionPane.showMessageDialog(null, "Enter valid data");
        } else {
            avgIncome = totalIncome / numberOfEntries;
            closingMsg = "Number of incomes received : " + numberOfEntries + "\n"
                        + "Average income: " + avgIncome + "\n"
                        + "Minimum income: " + minIncome + "\n"
                        + "Maximum Income: " + maxIncome + "\n"
                        + "Total income: "  + totalIncome + "\n"
                        + "End of Program";

            JOptionPane.showMessageDialog(null, closingMsg);
        }

        System.exit(0);

    } //end of main
} //end of class
