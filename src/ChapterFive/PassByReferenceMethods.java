package ChapterFive;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PassByReferenceMethods {

    public static void main(String[] args) {
        //Create a date, formart and print
        GregorianCalendar dateInMain = new GregorianCalendar(2025, 4, 14);
        long dateInMainMS = dateInMain.getTimeInMillis();

        DateFormat longDate1 = DateFormat.getDateInstance(DateFormat.LONG);
        String dateInMainString = longDate1.format(dateInMainMS);
        System.out.println("dateInMain before method call: " + dateInMainString );

        addYear(dateInMain, longDate1); //pass two objects by reference

        //method addYear returns control here
        dateInMainMS = dateInMain.getTimeInMillis(); //use same variable as before
        dateInMainString = longDate1.format(dateInMainMS);
        System.out.println("dateInMain after return: " + dateInMainString);


    }

    public static  void addYear (GregorianCalendar dateInAddYear, DateFormat longDate2){

        //Formart and print date received from main
        long dateInAddYearMS = dateInAddYear.getTimeInMillis();
        String dateInAddYearStr = longDate2.format(dateInAddYearMS);
        System.out.println(" dateInAddYear before Add: " + dateInAddYearStr);

        dateInAddYear.add(Calendar.YEAR,1); // add one year to date

        //reformart adjusted date and print
        dateInAddYearMS = dateInAddYear.getTimeInMillis();
        dateInAddYearStr = longDate2.format(dateInAddYearMS);
        System.out.println("dateInAddYear after add: " + dateInAddYearStr);

        //control return to main

    } //end addyear
}//endOfClass
