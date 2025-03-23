package ChapterFive;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DaysLeftInTheYear {
    public static void main(String[] args) {

        Date currentDate = new Date();

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(currentDate);

        //Get current year
        int currentYear = calendar.get(Calendar.YEAR);

        //set the end of the current year
        Calendar endOfYear = new GregorianCalendar(currentYear, Calendar.DECEMBER, 31);
        //convert End of year to ms
        endOfYear.getTimeInMillis();
        //System.out.println(endOfYear);
        Calendar today = Calendar.getInstance();

        long difInMS = endOfYear.getTimeInMillis() - today.getTimeInMillis();

        long diffInDays = difInMS / (24 * 60 * 60 * 1000);

        System.out.println(diffInDays);
    }
}
