package ChapterThree_DecisionMaking;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MinMaxAvg {
    public static void main(String[] args) {
        System.out.println("Find the minimum, maximum or average");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int selection;
        int average;
        int maximum;
        int minimum;
        System.out.println("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        num3 = scanner.nextInt();
        System.out.println("Enter the fourth number: ");
        num4 = scanner.nextInt();
        System.out.println("Enter the fifth number: ");
        num5 = scanner.nextInt();

        System.out.println("Enter 1 to show the average: \n  " +
                "Enter 2 to show the minimum: \n" +
                "\"Enter 3 to show the maximum: \\n\"");
        selection = scanner.nextInt();
        switch (selection){
            case 1:
                average = (num1 + num2 + num3 + num4 + num5)/5;
                break;
            case 2:
                if(num1 <  num2 && num1 < num3 && num1 < num4 && num1 < num5 ){
                    minimum = num1;
                    System.out.println("The minimum is : " + minimum);
                } else if (num2 <  num1 && num2 < num3 && num2 < num4 && num2 < num5 ){
                    minimum = num2;
                    System.out.println("The minimum is : " + num2);
                }else if (num3 <  num1 && num3 < num2 && num3 < num4 && num3 < num5 ){
                    minimum = num3;
                    System.out.println("The minimum is : " + num3);
                }else if (num4 <  num1 && num4 < num2 && num4 < num3 && num4 < num5 ){
                    minimum = num4;
                    System.out.println("The minimum is : " + num4);
                }else{
                System.out.println("The minimum is:  " + num5);
                }
                break;
            case 3:
                if(num1 >  num2 && num1 > num3 && num1 > num4 && num1 > num5 ){
                    maximum = num1;
                    System.out.println("The maximum is : " + num1);
                } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2  > num5 ){
                    maximum = num2;
                    System.out.println("The maximum is : " + num2);
                }else if (num3  >  num1 && num3  > num2 && num3  > num4 && num3  > num5 ){
                    maximum = num3;
                    System.out.println("The maximum is : " + num3);
                }else if (num4  >  num1 && num4  > num2 && num4 > num3 && num4  > num5 ){
                    maximum = num4;
                    System.out.println("The maximum is : " + num4);
                }else
                    maximum = num5;
                System.out.println("The maximum is:  " + maximum);
                break;
            default:
                System.out.println("Invalid selection");
        }
    }
}
