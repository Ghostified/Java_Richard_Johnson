package ChapterThree_DecisionMaking;

import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        double userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        userInput = scanner.nextDouble();
        System.out.println();
        int secondInput;
        System.out.println("Enter an Integer of value between 1 -10");
        secondInput = scanner.nextInt();
        System.out.println();
        double result;

     switch ((int) userInput){
         case 1:
             result = Math.pow(userInput,1);
             System.out.println(result);
             break;
         case 2:
             result = Math.pow(userInput,2);
             System.out.println(result);
             break;
         case 3:
             result = Math.pow(userInput,3);
             System.out.println(result);
             break;
         case 4:
             result = Math.pow(userInput,4);
             System.out.println(result);
             break;
         case 5:
             result = Math.pow(userInput,5);
             System.out.println(result);
             break;
         case 6:
             result = Math.pow(userInput,6);
             System.out.println(result);
             break;
         case 7:
             result = Math.pow(userInput,7);
             System.out.println(result);
             break;
         case 8:
             result = Math.pow(userInput,8);
             System.out.println(result);
             break;
         case 9:
             result = Math.pow(userInput,9);
             System.out.println(result);
             break;
         case 10:
             result = Math.pow(userInput,10);
             System.out.println(result);
             break;
         default:
             System.out.println("Invalid choice");
     }

    }
}
