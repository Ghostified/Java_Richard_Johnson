package ChapterThree_DecisionMaking;

import java.util.Scanner;

public class NetPay {
    public static void main(String[] args) {

        int hourlyWage;
        int numberOfHours;
        int grossPay  ;

        System.out.println("Net Pay Calculator");
        Scanner scanner = new Scanner( System.in);
        System.out.println("Enter your Hourly wage: ");
        hourlyWage = scanner.nextInt();
        System.out.println();
        System.out.println("Enter the number of hours worked");
        numberOfHours = scanner.nextInt();
        System.out.println();

        grossPay = hourlyWage * numberOfHours;
        int federalTax;
        int stateTax;
        int localTax;

        if (grossPay > 5000){
            federalTax = (int) 0.20;
            stateTax = (int)0.10;
            localTax = (int) .05;
            int taxes = (grossPay  * stateTax) + (grossPay * stateTax) + (grossPay * localTax);
            int netPay = grossPay - taxes;
            System.out.println("\n Your Gross Pay is : " + grossPay);
            System.out.println("Your Taxes are : /n"
                    +" Federal Tax: \n" +federalTax
                    + "State Tax:  \n" + stateTax
                    + "Local Tax: \n" + localTax);
            System.out.println("\n Your total taxes are : " + taxes);
            System.out.println("Your Net income is " + netPay);
        } else {
            federalTax = (int) 0.10;
            stateTax = (int)0.05;
            localTax = (int) .025;
            int taxes = (grossPay  * stateTax) + (grossPay * stateTax) + (grossPay * localTax);
            int netPay = grossPay - taxes;
            System.out.println("\n Your Gross Pay is : " + grossPay);
            System.out.println("Your Taxes are : /n"
                    +" Federal Tax: \n" +federalTax
                    + "State Tax:  \n" + stateTax
                    + "Local Tax: \n" + localTax);
            System.out.println("\n Your total taxes are : " + taxes);
            System.out.println("Your Net income is " + netPay);
        }

    }
}
