package ChapterFive;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DaysLeftInTheYear {
    public static void main(String[] args) {
        GregorianCalendar endOfYear = new GregorianCalendar(2025,12,31);
        endOfYear.getTimeInMillis();
        //System.out.println(endOfYear);
        Calendar today = Calendar.getInstance();

        long difInMS = endOfYear.getTimeInMillis() - today.getTimeInMillis();

        long diffInDays = difInMS / (24 * 60 * 60 * 1000);

        System.out.println(diffInDays);
    }
}
