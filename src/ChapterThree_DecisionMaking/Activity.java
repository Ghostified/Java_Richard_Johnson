package ChapterThree_DecisionMaking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Activity {
    public static void main(String[] args) {

        String day;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the day of the week (eg Monday, Tuesday, etc)");
        day = scanner.nextLine().trim();

        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Monday is a day for work");
        } else if(day.equalsIgnoreCase("Tuesday")){
            System.out.println("Tuesday to code");
        } else if (day.equalsIgnoreCase("Wednesday")){
            System.out.println("Wednesday is to write projects");
        } else if(day.equalsIgnoreCase("Thursday")){
            System.out.println("Thursday is for  Http");
        } else if (day.equalsIgnoreCase("Friday")){
            System.out.println("Friday is for building  in public");
        }else if(day.equalsIgnoreCase("saturday")){
            System.out.println("Saturday is for spring boot");
        } else  if (day.equalsIgnoreCase("Sunday")){
            System.out.println("Its the day for reading Java");
        } else {
            System.out.println("Invalid Entry");
        }
    }
}
