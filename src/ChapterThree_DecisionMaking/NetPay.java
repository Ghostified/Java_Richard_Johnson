package ChapterThree_DecisionMaking;

import java.util.Scanner;

public class NetPay {
    public static void main(String[] args) {

        int hourlyWage;
        int numberOfHours;
        int grossPay  ;
        double federalTax = 0;
        double stateTax = 0;
        double localTax = 0;

        System.out.println("Net Pay Calculator");
        Scanner scanner = new Scanner( System.in);
        System.out.println("Enter your Hourly wage: ");
        hourlyWage = scanner.nextInt();
        System.out.println();
        System.out.println("Enter the number of hours worked");
        numberOfHours = scanner.nextInt();
        //System.out.println();

        grossPay = hourlyWage * numberOfHours;


        if (grossPay > 5000){
            federalTax =  0.20;
            stateTax = 0.10;
            localTax = .05;
            System.out.print("Your Taxes are : Federal Tax: " +federalTax + "\n State Tax:  " + stateTax + "\n Local Tax: " + localTax);
            double taxes = (grossPay  * stateTax) + (grossPay * stateTax) + (grossPay * localTax);
            double netPay = grossPay - taxes;
            System.out.print("\n Your Gross Pay is : " + grossPay);
            System.out.println("\n Your total taxes are : " + taxes);
            System.out.println("\n Your Net income is " + netPay);
        } else {
            federalTax =  0.10;
            stateTax = 0.05;
            localTax = .025;
            System.out.print("Your Taxes are : Federal Tax: " +federalTax + "\n State Tax:  " + stateTax + "\n Local Tax: " + localTax);
            double taxes = (grossPay  * stateTax) + (grossPay * stateTax) + (grossPay * localTax);
            double netPay = grossPay - taxes;
            System.out.print("\n Your Gross Pay is : " + grossPay);
            System.out.println("\n Your total taxes are : " + taxes);
            System.out.println("\n Your Net income is " + netPay);
        }

    }
}
