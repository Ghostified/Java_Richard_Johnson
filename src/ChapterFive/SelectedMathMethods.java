package ChapterFive;

public class SelectedMathMethods {


    public static void main(String[] args) {

        //abs - returns the absolute value of the argument
        double aNumber = -3;
       double  absoluteValue = Math.abs(aNumber);
        System.out.println(absoluteValue);

        //ceil
        double num2 = 1.01, ceilValue;
        ceilValue = Math.ceil(num2);
        System.out.println(ceilValue);

        //floor
        double num3 = 2.01, floorValue;
        floorValue = Math.floor(num3);
        System.out.println(num3);

        //max
        double num4 = 5.89;
        double num5 = 9.657;
        double maxValue = Math.max(num5,num4);
        System.out.println(maxValue);

        //pow  -> returns a double of the first value doubled  to the power of the second value
        double num6 = 6.7;
        double num7 = 8.9;
        Double powerValue  = Math.pow(num7, num6);
        System.out.println(powerValue);

        //Random -. Returns a double number btn 0.0 and 1.0 inclusive
        double aRandomNumber = Math.random();
        System.out.println(aRandomNumber);

        //Returns a longh number closest to the argument
        double num8 = 15.67;
        long roundedValue;
        roundedValue = Math.round(num8);
        System.out.println(roundedValue);

     //Returns a longh number closest to the argument
     double num8 = 15.67;
     long roundedValue;
     roundedValue = Math.round(num8);
     System.out.println(roundedValue);
    }
}

