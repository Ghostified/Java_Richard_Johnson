package ChapterFive;

import java.text.DateFormat;

public class DateFormarts {
    public static void main(String[] args) {
        String  myDate =  "11th Sep 2024";
        String myString = DateFormat.getDateInstance().toString();
        System.out.println(myString);
    }
}
