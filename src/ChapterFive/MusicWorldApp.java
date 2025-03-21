package ChapterFive;

import javax.swing.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MusicWorldApp {

    static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    static NumberFormat percentFormatter = NumberFormat.getPercentInstance();
    static DecimalFormat decimalFormatter = (DecimalFormat) percentFormatter;
    public static void main(String[] args) {

        //Declare Variables
        String idMessage = "This program calculates the total cost of a cd order \n"
                 + "Please enter the ID of the item or X to end this order now",
                titleMessage = "Please enter the title of the CD",
                priceMessage = " Please enter the price of the CD in US Dollars",
                quantityMessage = " Please enter the quantity to be purchased ",
                outputMessage,
                totalMessage,
                cdID,
                cdTitle,
                cdPriceString,
                cdQuantityString,
                taxRateString,
                discountRateString,
                choiceString;

        int cdQuantity = 0,itemCount = 0;
        double cdPrice = 0,
                cdSubTotal =0,
                orderSubtotal = 0,
                orderTotal =0,
                cdDiscount = 0;
        final Double TAX_RATE = 0.625,
                DISCOUNT_FOR_5 = 0.10,
                DISCOUNT_FOR_10 = 0.15,
                DISCOUNT_FOR_15 = 0.20;
        do {
           //ask for input from the user
           cdID = JOptionPane.showInputDialog(idMessage);
           if(cdID.equalsIgnoreCase("x"))
               break;
           cdTitle = JOptionPane.showInputDialog(titleMessage);
           cdPriceString = JOptionPane.showInputDialog(priceMessage);
           cdQuantityString = JOptionPane.showInputDialog( quantityMessage);

           //processing input from the user
            decimalFormatter.applyPattern("###.000%");
            taxRateString = decimalFormatter.format(TAX_RATE);

            cdPrice = Double.parseDouble(cdPriceString); //convert string to double
            cdQuantity = Integer.parseInt(cdQuantityString) ; //convert string to int

            //determine discount to be applied
            if (cdQuantity >= 15){
                cdDiscount = DISCOUNT_FOR_15;
            } else if (cdQuantity >= 10){
                cdDiscount = DISCOUNT_FOR_10;
            } else if (cdQuantity >= 5){
                cdDiscount = DISCOUNT_FOR_5;
            } //end if

            discountRateString = decimalFormatter.format(cdDiscount);
            cdSubTotal = cdPrice * cdQuantity * ( 1 - cdDiscount);
            orderSubtotal += cdSubTotal; //add the subtotal to the cd to the order subtotal
            itemCount++; //count the number of CD's in this order

            //call the displayOutput Method
            choiceString = displayItemOutput(cdID, cdTitle, cdPrice , cdQuantity, discountRateString, cdSubTotal, taxRateString);
            if(choiceString.equalsIgnoreCase("r"))
            {
                itemCount --; //reduce item count
                orderSubtotal -= cdSubTotal ; //deduct cdSubtotal from orderSubTotal;
            } // end if


        } while ( !(choiceString.equalsIgnoreCase("x")));
        displayOrderOutput(orderSubtotal, TAX_RATE, itemCount);
    } // end main

    public static String  displayItemOutput (String cdId, String cdTitle, double cdPrice ,int cdQuantity,
                                              String discountRateString, double cdSubTotal,String taxRateString ){
        String choiceString;
        String cdPriceString = currencyFormatter.format(cdPrice);
        String cdSubTotalString = currencyFormatter.format(cdSubTotal);
        String outputMessage = "Summary for the current item: \n\n"
                + "CD ID "             + cdId                    +"\n"
                + "CD Title "          + cdTitle                 +"\n"
                + "CD Unit Price "     + cdPriceString           +"\n"
                + "CD Quantity "       + cdQuantity              +"\n"
                + "CD Discount"        + discountRateString      +"\n"
                + "Subtotal"           + cdSubTotalString        +"\n"
                + "Tax Rate "          + taxRateString           +"\n"
                + "Enter \n "
                + "R to re-enter data for this item \n"
                + "X to end this order now \n"
                + "Anything else to continue ";

        choiceString = JOptionPane.showInputDialog( outputMessage) ; // get choice
        return choiceString;
    } //end of displayOutputMsg method

    public  static  void displayOrderOutput (double orderSubTotal, final  double TAX_RATE, int itemCount){

        //final output

        //calculate total and format to 2dp.
        double orderTotal;
        String orderTotalString, totalMessage;

        orderTotal = orderSubTotal * (1 + TAX_RATE);
        orderTotalString = currencyFormatter.format(orderTotal);

        totalMessage = "The total of the " + itemCount + " -item CD Order is " + orderTotalString;
        JOptionPane.showMessageDialog(null, totalMessage);

    } //end of displayFinalOutput
}
