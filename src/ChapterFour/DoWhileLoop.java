package ChapterFour;


import javax.swing.*;

//Illustrating the use of a do while loop
public class DoWhileLoop {
    public static void main(String[] args) {
        //declare and initialize variables
        int choice;
        String choiceString;
        String displayString = " ";

        //opening message to user
        String menu = "Enter  \n"
                + "1 to diplay Hello \n"
                + "2 to display World \n"
                + "3 to display Hello World! \n"
                + "4 to quit the program";

        do {
            choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);

            switch (choice){
                case 1:
                    displayString = "Hello";
                    break;
                case 2:
                    displayString = "World";
                    break;
                case 3:
                    displayString = "Hello World";
                    break;
                case 4:
                    System.exit(0);
            } //end switch case

            JOptionPane.showMessageDialog(null,displayString);
        } while ( choice != 4);

        System.exit(0);
    } //end main
}//end class
