package ChapterThree_DecisionMaking;
/*
An application to calculate insurance risk
Increase in height/weight ration the risk increases
Smoking also increases the risk
Life insurance risk is measure in height medium and low
Each risk category has a premium to be paid
User is only shown their risk category and the premium to be paid

 */

import java.util.Scanner;

public class InsuranceRiskPremiums {
    public static void main(String[] args) {

        String name, smoker, output;
        int age, height, mass , riskFactor;
        double massToHeightRatio,monthlyPremium = 0;
        final double lowRiskPremium = 100, mediumRiskPremium = 200 , highRiskPremium = 300;
        boolean lowRisk, mediumRisk , highRisk;

        Scanner input = new Scanner(System.in);

        String instructions = "This program calculates the Risk Factor of a person " +
                " and shows their monthly premium payments \n";

        System.out.print(instructions);

        //Get user input
        System.out.print(" Enter your name:       ");
        name = input.nextLine();
        System.out.print("Enter your age:     ");
        age = input.nextInt();
        System.out.print("Enter your weight:      ");
        mass = input.nextInt();
        System.out.print("Enter your height:      ");
        height = input.nextInt();
        input.nextLine();
        System.out.print("Are you a smoker(Enter y or n):     ");
        smoker = input.nextLine();
        System.out.println();
        
        
        //calculate massToHeightRatio
        massToHeightRatio = ((double) mass) / height ;

        highRisk = massToHeightRatio >= 3 && age > 50 && smoker.equalsIgnoreCase("y");
        mediumRisk = massToHeightRatio < 3 && age < 50 && smoker.equalsIgnoreCase("n");
        lowRisk = !highRisk && !mediumRisk;

        //determine risk factor
        if (highRisk){
            riskFactor = 3;
        } else if (mediumRisk) {
            riskFactor = 2;
        } else {
            riskFactor = 1;
        };

        //determine monthly premium
        switch (riskFactor){
            case 3:
                monthlyPremium = highRiskPremium;
                break;
            case 2:
                monthlyPremium = mediumRiskPremium;
                break;
            case 1:
                monthlyPremium = lowRiskPremium;
                break;
        }

        output =  "The individual being analyzed is:  " + name + "\n"
                + "Age : " + age + "\n"
                + "Height: " + height + "\n"
                + "Mass: " + mass + "\n"
                + "Smoker: " + smoker + "\n"
                +  "HeightToWeightRatio: " + massToHeightRatio  + "\n"
                + "Insurance Risk Factor (3 = High, 2 = Medium , 1 = Low ): " + riskFactor + "\n"
                + "Monthy premium payment is:   " + monthlyPremium + " shillings" +  "\n"
                + "End of program";

        //display output
        System.out.println(output);
        input.close();
    }
}
