package ChapterFour;

import javax.swing.*;

public class MusicWorld {
    public static void main(String[] args) {

        String idMessage = "This program calculates the total cost of a CD Order \n" +
                "Please enter the ID of the item or X to end this order now\n";
        String titleMessage = "Please enter the tite of the CD";
        String priceMessage = "Please enter the price of the CD in US Dolars";
        String quantityMessage = "Please enter thr quantity to be purchased";
        String outputMessage,
                totalMessage,
                cdID,
                cdTitle,
                cdPriceString,
                cdQuantityString,
                taxRateString,
                discountRateString,
                choiceString;
        int cdQuantity = 0,
                itemCount = 0;
        double cdPrice = 0 ,
                cdSubtotal = 0,
                orderSubTotal = 0,
                orderTotal =0,
                cdDiscount = 0;
        final double TAX_RATE = .625,
                DISCOUNT_FOR_FIVE = .10,
                DISCOUNT_FOR_TEN = .15,
                DISCOUNT_FOR_15 = .20;

        do {
            //input
            cdID = JOptionPane.showInputDialog(idMessage);
            if (cdID.equalsIgnoreCase("X"))
                break;
            cdTitle = JOptionPane.showInputDialog(titleMessage);
            cdPriceString = JOptionPane.showInputDialog(priceMessage);
            cdQuantityString = JOptionPane.showInputDialog(quantityMessage);

            //processing

            taxRateString = 100 * TAX_RATE + " %";
            cdPrice = Double.parseDouble(cdPriceString);
            cdQuantity = Integer.parseInt(cdQuantityString);

            //determine quantity of the discount
            if (cdQuantity >= 15 ){
                cdDiscount = DISCOUNT_FOR_15;
            } else if (cdQuantity >= 10) {
                cdDiscount = DISCOUNT_FOR_TEN;
            }  else {
                cdDiscount = DISCOUNT_FOR_FIVE;
            }
            discountRateString = 100 * cdDiscount + " %";

            //round off
            cdSubtotal = cdPrice * cdQuantity * (1 - cdDiscount);

            //add subtotal for this cd to the order sub-total
            orderSubTotal += cdSubtotal;

            outputMessage = "Summary of the current item:\n +" +
                    "CD ID: "    +  cdID + "\n"
                    + "CD Title:  " + cdTitle + " \n"
                    + " CD Unit Price: $  " + cdPrice + " \n"
                    + " CD Quantity: " + cdQuantity + " \n"
                    + " CD Discount: " + cdDiscount + " \n"
                    + " CD Sub-Total:  " + cdSubtotal + " \n"
                    + " CD Tax Rate:  " + taxRateString + " \n"
                    + "Enter \n"
                    + " R to reenter the date for this item: \n"
                    + "X to end the order \n"
                    + "Anything else to continue \n" ;

            ////get choice
            choiceString = JOptionPane.showInputDialog(outputMessage);
            if (choiceString.equalsIgnoreCase("r"))
            {
                itemCount = itemCount - 1; //reduce item count
                orderSubTotal -= cdSubtotal ; //deduct cd-subtotal from order sub total
            }
        } while (!(choiceString.equalsIgnoreCase( "x")));

        //calculate total and formart to two decimal
        orderTotal = orderSubTotal * (1  + TAX_RATE);
        totalMessage = "The total of the " + itemCount + " -item order is $ : " + orderTotal;
        JOptionPane.showMessageDialog(null, totalMessage);
    }
}
