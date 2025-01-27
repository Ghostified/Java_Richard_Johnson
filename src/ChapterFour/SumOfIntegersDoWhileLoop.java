package ChapterFour;

import javax.swing.*;

public class SumOfIntegersDoWhileLoop {
    public static void main(String[] args) {


        int sum =0;
        int input = 0;
        String output;


       do {
           String i = JOptionPane.showInputDialog("Enter a Number or 0 to exit: ");


           if (i == null){
               break;
           }

           input = Integer.parseInt(i);

           if (input >  0){
               sum = 0;
               for (int j = 1; j <= input ; j++){
                   sum += j;
               }
               output = "The sum of integers frm 1 to " + input + " equals to: " + sum;
               JOptionPane.showMessageDialog(null, output);
           } else  if ( input < 0){
               JOptionPane.showMessageDialog(null, "Please enter a positive integer or 0 to exit");
           }

       }
       while (input != 0);

    }

}
