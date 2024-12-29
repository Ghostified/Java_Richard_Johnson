package ChapterThree_DecisionMaking;

import javax.swing.*;
import java.util.Scanner;

/*
*  Calculate the sale of CD's
* Add discount
*
* */
public class MusicWorldApp {
    public static void main(String[] args) {
        String cdID, cdTitle;
        int cdQuantity;
        double cdPrice, cdDiscount = 0, cdTotal, cdSubTotal;
        final double TAX_RATE = 0.0625,DISCOUNT_FOR_FIVE = 0.10, DISCOUNT_FOR_TEN = 0.15, DISCOUNT_FOR_15 = 0.20;

        String openingMessage = "This Application calculates the cost of CD purchaes Order\n";
        System.out.println(openingMessage);



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the CD Id ");
        cdID = scanner.nextLine();
        System.out.println("Enter the CD Title");
        cdTitle = scanner.nextLine();
        System.out.println("Enter the price of the CD");
        cdPrice = scanner.nextDouble();
        System.out.println("Enter the  quantity of the CD's to be bought");
        cdQuantity = scanner.nextInt();

        if(cdQuantity >= 15){
            cdDiscount = DISCOUNT_FOR_15;
        } else if (cdQuantity >= 10){
            cdDiscount = DISCOUNT_FOR_TEN;
        } else if (cdQuantity >= 5)
        {
            cdDiscount = DISCOUNT_FOR_FIVE;
        }

        String cdDiscountString  = 100 * cdDiscount + "%";
        cdSubTotal = cdPrice * cdQuantity  * (1- cdDiscount);
        cdTotal = cdPrice * cdQuantity * (1- cdDiscount) * (1 + TAX_RATE);

        String saleOutputMessage = "The Transaction summary is as below:  \n"
                + "The Title of the CD:  " + cdTitle + "\n"
                + "The ID of the CD:  " + cdID + "\n"
                + "The unit price  of the CD:  " + cdPrice + "\n"
                + "The Quantity of the CD:  " + cdQuantity + "\n"
                + "CD Discount:  " + cdDiscountString + "\n"
                + "Sub-Total price:  " + cdSubTotal+ "\n"
                + "The Tax rate:  " + TAX_RATE+ "\n"
                + "The Total Price of the CD's :  " + cdTotal+ "\n";
        JOptionPane.showMessageDialog(null, saleOutputMessage);
    }
}
