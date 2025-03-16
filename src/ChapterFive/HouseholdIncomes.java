package ChapterFive;

import javax.swing.*;
import java.text.NumberFormat;

public class HouseholdIncomes {
    public static void main(String[] args) {
        int choice, numOfIncomes, numberOfEntries = 0;
        double income = 0, totalIncome = 0, maxIncome = 0, minIncome = 0, avgIncome = 0;
        String menu, choiceString = " ", incomeString, numOfIncomeString, openingMsg, incomeMsg;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        openingMsg = "This program find the average , maximum, and minimum \n"
                + "household income from a set of income inputs by the user.  ";

        JOptionPane.showMessageDialog(null, openingMsg);

        do {
            menu = "Enter \n"
                    + " 1 to enter incomes \n"
                    + " 2 to  display average income \n"
                    + " 3 to display max/min incomes \n "
                    + " 4 to quit";

            choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);

            switch (choice) {
                case 1:
                    //variables are reset to 0 to allow new data entry
                    totalIncome = 0;
                    maxIncome = 0;
                    minIncome = 0;
                    numberOfEntries = 0;

                    //get number of incomes
                    incomeMsg = "Please enter the number of incomes to be averaged";
                    numOfIncomeString = JOptionPane.showInputDialog(incomeMsg);
                    numOfIncomes = Integer.parseInt(numOfIncomeString);

                    // for loop to collect data
                    for (int i = 1; i <= numOfIncomes; i++) {
                        //Get income from the user
                        incomeString = JOptionPane.showInputDialog("Enter household income number " + i + ": ");
                        income = Double.parseDouble(incomeString);

                        //reset min income
                        if (numberOfEntries == 0) {
                            minIncome = income;
                        }

                        //process data
                        totalIncome += income;

                        if (income >= maxIncome) {
                            maxIncome = income;
                        }

                        if (income <= minIncome) {
                            minIncome = income;
                        }

                        numberOfEntries++;
                    } // end of for loop
                    break;

                case 2:
                    //display output
                    if (numberOfEntries == 0) {
                        JOptionPane.showMessageDialog(null, "You did not enter any valid income data ");
                    } else {
                        calculateAndDisplayAvg(totalIncome, numberOfEntries, currencyFormatter);
                    }
                    break;

                case 3:
                    //display output
                    if (numberOfEntries == 0) {
                        JOptionPane.showMessageDialog( null, "You did not enter any valid income data");
                    }
                    else
                    {
                        displayMinMax(minIncome, maxIncome, currencyFormatter);
                    }
                    break;

                case 4:
                    System.exit(0);

            } //end of switch case
        }
        while ( choice !=  4);

    }// end of main

    private static void displayMinMax(double minIncome, double maxIncome, NumberFormat currencyFormatter) {
        String minIncomeStr = currencyFormatter.format(minIncome);
        String maxIncomeStr = currencyFormatter.format(maxIncome);
        String minMaxIncomeMsg = "The minimum income is " + minIncomeStr + "\n\n"
                + "The maximum income is " + maxIncomeStr ;
        JOptionPane.showMessageDialog(null,minMaxIncomeMsg);
    }

    private static void calculateAndDisplayAvg(double totalIncome, int numberOfEntries, NumberFormat currencyFormatter) {
        double avgIncome = totalIncome / numberOfEntries;
        String avgIncomeString = currencyFormatter.format(avgIncome);
        String avgIncomeMsg = " The average income is: " + avgIncomeString ;
        JOptionPane.showMessageDialog(null, avgIncomeMsg);
    } //end of method
}

