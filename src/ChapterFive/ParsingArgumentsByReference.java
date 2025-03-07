package ChapterFive;

import java.awt.*;

public class ParsingArgumentsByReference {
    public static void main(String[] args) {
        //point class in java
        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;

        System.out.println("x =  " + p1.x + " y= " + p1.y);

        change(p1);
        System.out.println("x =  " + p1.x + " y= " + p1.y);



    }

    private static void change (Point p){
        p.x = 9;
        p.y = 11;
    }
}
