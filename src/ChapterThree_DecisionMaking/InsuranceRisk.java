package ChapterThree_DecisionMaking;
/*
An application to calculate insurance risk
Increase in height/weight ration the risk increases
 Smoking also increases the risk
 Life insurance risk is measure in height medium and low

 */

import javax.swing.*;
import java.util.Scanner;

public class InsuranceRisk {
    public static void main (String [] args){

        int age , height , mass;
        double massToHeightRatio;
        String name, smoker;
        boolean highRisk, lowRisk, mediumRisk;
        String instructions, output;

        //Take input
        Scanner input = new Scanner(System.in);

        instructions = "This program assesses the insurance risk for an individual. \n "
                + " Answer all the questions. \n\n";

        System.out.println(instructions);

        System.out.println("Enter the name: ............. ");
        name = input.nextLine();
        System.out.println(" Is the individual a smoker? (Enter  y or n) ? .....");
        smoker = input.nextLine();
        System.out.println(" Enter the age of the individual:         ");
        age = input.nextInt();
        System.out.println(" Enter the height of the individual:      ");
        height = input.nextInt();
        System.out.println("Enter the mass of the individual:      ");
        mass = input.nextInt();
        System.out.println();

        //data procession
        massToHeightRatio = ((double) mass) / height;

        //use logical expressions:
        highRisk = massToHeightRatio >= 3 && age >= 50 && smoker.equalsIgnoreCase("y");
        lowRisk = massToHeightRatio < 3 && age < 50 && smoker.equalsIgnoreCase("n");
        mediumRisk = !highRisk && !lowRisk;

        output = "The individual being analyzed is " + name             + "\n\n"
                +  " Age:                            " + age             + " \n"
                + "Mass:                        " + mass                   +"\n"
                + "+Smoker:                     " + smoker                  +"\n"
                + "Weight to height ratio:      " + massToHeightRatio       +"\n"
                + "Insurance risk assessment is as below: \n"
                + "High Risk:                   " + highRisk + "\n"
                + "Medium Risk:                 " + mediumRisk + "\n"
                + "Low Risk:                    " + lowRisk + "\n"
                + "End of program \n\n";

        //Display output
        System.out.println(output);

    }//end main
}//end class
