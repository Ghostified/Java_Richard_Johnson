package ChapterFour;

import javax.swing.*;
import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {

        // enter a number
        //if number = 3
        // find number form 3 to 0

        // sum all the number between 3 to 0

        String num = "Enter a number";

        int  sum = 0;

        int input = 0;

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a number: " );
//        num = scan.nextInt();
//
//       for (int i = 0; i <= num; i++){
//
//          sum = sum + i;
//       }
//        System.out.println(sum);


        String message = "  Purpose of this program is to show the sum of integers from 0 to a certain to a value,\n" +
                "Enter a number: ";


        num = JOptionPane.showInputDialog(message);

        input  = Integer.parseInt(num);

        for ( int i = 0; i <= input; i++){

            sum = sum + i;
        }
        String output = "The Sum of all positive integers  to:    " + input + "  is equals to: ";

        JOptionPane.showMessageDialog(null, output +  sum );




    }
}
