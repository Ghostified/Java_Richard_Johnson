package ChapterFive;

import java.sql.SQLOutput;
import java.text.DateFormat;
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
    }
}
