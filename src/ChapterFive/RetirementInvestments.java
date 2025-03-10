package ChapterFive;

import javax.swing.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.GregorianCalendar;

public class RetirementInvestments {
    public static void main(String[] args) {

        // initialize variables
        String nameMessage = "This is a program for retirement Savings \n"
                + "Please Enter your Names: First, Middle & Last",
                retirementDateMsg = "Please Enter your planned retirement date ( DD/MM/YYYY)" ,
                investmentMsg = "Please enter the amount of your monthly investment " + " \n"
                                 + " into  a retirement account in $ ",
                intRateMsg = "Please enter the expected annual intrest rate " + " \n"
                            + "  (for example , enter 5 for 5%)",
                outputMsg;
        String lastName = " ", name, retirementDateString , monthString, dayString, investmentString ,
                        intrestRateString, retirementAmountString;

        int month, day, year;
        long todayInMS, retirementDateInMS ; //milliseconds require a long data type
        double monthlyInvestment , interestRate, retirementAmount;
        GregorianCalendar today, retirementDate;
        NumberFormat currencYformart  = NumberFormat.getCurrencyInstance();
        DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);

        //Input
        name = JOptionPane.showInputDialog(nameMessage);
        retirementDateString = JOptionPane.showInputDialog(retirementDateMsg);
        investmentString = JOptionPane.showInputDialog(investmentMsg);
        intrestRateString = JOptionPane.showInputDialog(intRateMsg);

        //processing

        //get Last Name
        name = name.trim();
        for(int i = name.length() - 1; i > 0; i--){
            if (name.charAt(i) == ' '){
                lastName = name.substring( i + 1, name.length());
                break;
            }
        }

        //get month , day, and year for retirement date
        retirementDateString = retirementDateString.trim();
        int indexOfFirstSlash = retirementDateString.indexOf('/');
        int indexOfSecondSlash = retirementDateString.indexOf( '/', indexOfFirstSlash + 1  );
        monthString = retirementDateString.substring(0, indexOfFirstSlash);
        dayString = retirementDateString.substring(indexOfFirstSlash + 1 , indexOfSecondSlash);
        String yearString = retirementDateString.substring(indexOfSecondSlash + 1, retirementDateString.length());

        month = Integer.parseInt(monthString) -1; //Subtract 1 , as months begin at 0
        day = Integer.parseInt(dayString);
        year = Integer.parseInt(yearString);

        //get today's date and set retirement date
        today = new GregorianCalendar();
        retirementDate = new GregorianCalendar( year, month, day);

        //Calculate years until  retirement
        todayInMS = today.getTimeInMillis();
        retirementDateInMS = retirementDate.getTimeInMillis();

        //1000 milliseconds per sec, 60 sec per min, 60 min per hour, 24 hrs a day, 365 days a year
        double yearsUntilRetirement = (retirementDateInMS - todayInMS) / 1000/60/60/24/365.0;

        //calculateRetirementAmount --> calculated daily
        monthlyInvestment = Double.parseDouble(investmentString);
        interestRate = Double.parseDouble(intrestRateString) / 100;

        //formula for annuity
        retirementAmount = ( monthlyInvestment * 12 / interestRate) * (Math.pow(1 + (interestRate) / 365 , 365 * (yearsUntilRetirement )) - 1);

        //output

        //formart retirement amount as currency and retirement date w/ long date format
        retirementAmountString = currencYformart.format(retirementAmount);
        retirementDateString = longDate.format(retirementDateInMS);

        //display output
        outputMsg = " Dear Mr./Ms "  + lastName + " :\n"
                     + "At your retirement on  " + retirementDateString + " \n"
                    +  " the total amount of your investment will be \n"
                     + retirementAmountString ;

        JOptionPane.showMessageDialog(null, outputMsg);
        System.exit(0);


    } //end main
}//end class
