package ChapterFour;

import java.util.Scanner;

public class SumIntegersBreak {
    public static void main(String[] args) {

        int input = 0;
        int counter;

        int sum = 0;

//        while(input <= 10 ){
//
//
//            switch (input){
//                case 1:
//                    System.out.println("Enter a Number: ");
//                    Scanner scan = new Scanner(System.in);
//                    input = scan.nextInt();
//
//            }
//
//        }
//        System.out.println(sum);
        Scanner scan = new Scanner(System.in);


        for (counter = 0; counter <= 10 ; counter++){

            switch (counter) {
                case 1:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 2:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 3:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 4:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 5:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 6:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 7:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 8:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 9:
                    System.out.println("Enter a number: ");
                    input = scan.nextInt();
                    sum = sum + input;
                    break;
                case 10:
            }

            System.out.println("The total sum:" + sum);
        }
    }
}
