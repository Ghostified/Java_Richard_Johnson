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
        final double TAX_RATE = 0.625,
                DISCOUNT_FOR_FIVE = .10,
                DISCOUNT_FOR_TEN = .15,
                DISCOUNT_FOR_15 = .20;

        do {
            //input
            cdID = JOptionPane.showInputDialog(idMessage);
            if
        }
    }
}
