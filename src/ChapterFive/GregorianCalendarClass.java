package ChapterFive;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarClass {
    public static void main(String[] args) {
        GregorianCalendar dob = new GregorianCalendar( 1995, 7, 14);
        int dow = dob.get(GregorianCalendar.DAY_OF_WEEK);
        System.out.println(dow);

        long birthTime = dob.getTimeInMillis();
        DateFormat longDate = DateFormat.getDateInstance(DateFormat.LONG);
        String birthdayStr = longDate.format(birthTime);
        System.out.println(birthdayStr);


        //Example Two
        Calendar taxDeadline = new GregorianCalendar(2026, 6,1);
        taxDeadline.add(GregorianCalendar.YEAR, 10);
        long taxDeadLineTime = taxDeadline.getTimeInMillis();
        DateFormat longFormart = DateFormat.getDateInstance(DateFormat.LONG);
        String taxDeadLineString = longFormart.format(taxDeadLineTime);
        System.out.println(taxDeadLineString);

        //Example 3
        GregorianCalendar deadLine = new GregorianCalendar(2027, 5,6, 23, 59);
        long deadLineTime = deadLine.getTimeInMillis();
        DateFormat shortDeadLine = DateFormat.getTimeInstance(DateFormat.SHORT);
        String deadLineString = shortDeadLine.format(deadLineTime);
        System.out.println(deadLineString + " " + deadLine.get(GregorianCalendar.DATE));


    }
}
