package ChapterFour;

import javax.swing.*;

public class HouseHoldIncome2 {
    public static void main(String[] args) {
        //declare and initial variables
        int numberOfEntries = 0;
        int numberOfIncomes = 0;
        double income , avgIncome= 0;
        double totalIncome = 0;
        double maxIncome = 0;
        double minIncome = 0;
        String incomeString, openingMsg, outputMsg , numOfIncomeStrings;


        //Opening Msg To User
        openingMsg = "This program finds the average , maximum and minimum\n"
                + "Household income from a set of incomes input by the user \n"
                + "Please enter the number of incomes to be averaged ";

        numOfIncomeStrings = JOptionPane.showInputDialog( openingMsg );
        numberOfIncomes = Integer.parseInt(numOfIncomeStrings);


        //for loop to collect data
        for(int i = 1 ; i <= numberOfIncomes ; i++){


            //get income from user
            incomeString = JOptionPane.showInputDialog(
                    "Enter household income number " + i + ": "
            );
            income = Double.parseDouble( incomeString);

            //reset min income
            if (numberOfEntries == 0); //TRUE For the first income
            minIncome = income;

            totalIncome = totalIncome +  income;

            if (income > maxIncome){
                maxIncome = income;
            }

            if (income < minIncome){
                minIncome = income;
            }

            numberOfEntries++;

        } //end for loop

        //display output
        if (numberOfEntries == 0){
            JOptionPane.showMessageDialog(null, "You did not enter a valid income");
        } else {
            avgIncome = totalIncome / numberOfEntries;

            outputMsg = "Number of incomes entered: " + numberOfEntries + "\n"
                    + "Average Income:      $" + avgIncome + "\n"
                    + "Maximum Income:      $" + maxIncome + "\n"
                    + "MinimumIncome:       $" + minIncome + "\n"
                    + "End of Program";

            JOptionPane.showMessageDialog(null, outputMsg);
        } //end Else

        System.exit(0);

    } //end main
} //end class
