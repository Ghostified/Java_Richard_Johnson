package ChapterFour;

import javax.swing.*;

public class DoWhileIncome {
    public static void main(String[] args) {
        String incomeString;
        int numberOfIncomes;
        String menu;
        int choice;
        int numberOfEntries = 0;
        double income = 0;
        double totalIncome = 0;
        double maxIncome =0;
        double minIncome = 0;
        double averageIncome = 0;
        String choiceString = " ";
        String openingMessage ;
        String outputMessage;
        String incomeMessage;
        String numberOfIncomeString;

        openingMessage = "This program takes the number of incomes \n"
                + "Displays the Toal Income, Average and Miimum";
        JOptionPane.showMessageDialog(null, openingMessage);

        do {
            menu = "Enter \n"
                    + "Select 1 to enter the number of incomes:  \n"
                    + "Select 2 display the average income :  \n"
                    + "Select 3 to show the max and min oncome:  \n"
                    + "Select 4 to quit the program: \n";

            choiceString = JOptionPane.showInputDialog(menu);

            choice = Integer.parseInt(choiceString);

            switch (choice){
                case 1:
                    income = 0;
                    maxIncome = 0;
                    totalIncome =0;
                    minIncome =0;
                    averageIncome = 0;

                    //get number of incomes
                    incomeMessage = "Enter the number of incomes to be averaged: ";
                    numberOfIncomeString = JOptionPane.showInputDialog(incomeMessage);
                    numberOfIncomes = Integer.parseInt(numberOfIncomeString);

                    //For loop to collect the data
                    for (int i = 1; i <= numberOfIncomes; i++){
                        //get income from the user
                        incomeString = JOptionPane.showInputDialog("Enter household income number: " + i + " : ");
                        income = Double.parseDouble(incomeString);

                        //reset income to min
                        if(numberOfEntries == 0) {
                            minIncome = income;
                        }

                        //process data
                        totalIncome = totalIncome + income;

                        if (income >= maxIncome) {
                            maxIncome = income;
                        }

                        if (income <= minIncome) {
                            minIncome = income;
                        }

                        numberOfEntries ++;
                    } //end for loop
                    break;

                case 2:
                    //display output
                    if (numberOfEntries == 0) {
                        JOptionPane.showMessageDialog(null, "You did not enter any valid data");
                    } else {
                        averageIncome = totalIncome / numberOfEntries;
                        JOptionPane.showMessageDialog(null,
                                "The Average income is: " + averageIncome);
                    }
                    break;

                case 3:
                    //display output
                    if (numberOfEntries == 0) {
                        JOptionPane.showMessageDialog(null, "You did not enter any valid data");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Your maximum income is : " + maxIncome + "\n"
                                        + "The minimum income is : " + minIncome + "\n");
                    }

                    break;
                case 4:
                    System.exit(0);
                } // End switch

            }
        while( choice != 4);
        } //end main


    }//end class

