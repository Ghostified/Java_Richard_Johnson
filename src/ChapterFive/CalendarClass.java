package ChapterFive;

import java.text.DateFormat;
import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {


        //Calendar class methods
        //returns alot of info based on  the time and date setting of the computer
        Calendar today = Calendar.getInstance();
      //  System.out.println(today);

        //get
        //Returns the specific value of the specified value eg, day, month week etc

        int month = today.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int day = today.get(Calendar.DATE);
        System.out.println(day);
        int year = today.get(Calendar.YEAR);
        System.out.println(year);
        int zone = today.get(Calendar.ZONE_OFFSET);
        System.out.println(zone);

        //set
        //the set method sets the calendar object to a specific date and time
        Calendar dueDate = Calendar.getInstance();
        dueDate.set(2025, 5, 1);
        dueDate.add(Calendar.MONTH, 7);
        int newDueYear = dueDate.get(Calendar.YEAR);
        int newDueMonth = dueDate.get(Calendar.MONTH);
        int newDueDate = dueDate.get(Calendar.DATE);
        System.out.println("The new Due Date: " + newDueYear + " " + newDueMonth + " " + newDueDate);
        long dueTime = dueDate.getTimeInMillis();
        DateFormat longDueDate = DateFormat.getDateInstance(DateFormat.LONG);
        String myDueDateInLongForm = longDueDate.format(dueTime);
        System.out.println(myDueDateInLongForm);



    }
}
