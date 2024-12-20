package ChapterThree_DecisionMaking;
/*
Compare strings using the methods compareTo and equalsIgnoreCase in the String Class
 */

import javax.swing.*;

public class ComparisonApp {
    public static void main(String[] args) {
        int comparisonStrings;
        String string1 , string2;
        boolean stringsAreEqual;
        String introduction, outputMessage;

        System.out.println("This program compares two strings");
        System.out.println();


        //Take user input
        introduction = "This program compares two strings. \n";
        JOptionPane.showMessageDialog( null, introduction);
        string1 = JOptionPane.showInputDialog("Enter the first string");
        string2 = JOptionPane.showInputDialog("Enter string two");

        //Process the information
        comparisonStrings = string1.compareTo(string2);
        stringsAreEqual = string1.equalsIgnoreCase(string2);

        outputMessage =
                "String #1 is: " + string1 + "\n\n"
                + "string 2 is: " + string2 + "\n\n"
                + "If the value is negative . String #1 is less than string #2. \n"
                + "If the value is positive , String #1 is greater than string #2. \n"
                + "If the value is 0 , then the strings are both equal. \n"
                + "Value = " + comparisonStrings + "\n\n"
                + "The following confirms if the strings are equal \n"
                + "(Ignoring cases) : " + "\n\n"
                +"Strings are equal? " + stringsAreEqual + " \n\n"
                + "End of program ";

        //display output
        JOptionPane.showMessageDialog(null, outputMessage);

        System.exit(0);

    }//end main
}//end class
