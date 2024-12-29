package ChapterThree_DecisionMaking;

import java.util.Scanner;

/*
* The program  takes two integer
* Stores then in variables
* Use Logical expressions . -
* Output - the last word in the last line should be the content of a  boolean variable
* eg i =10, j = 20, output = " 10 < 10 " is true;
* */
public class IsGreaterThan {
    public static void main(String[] args) {
        int variableOne;
        int variableTwo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable");
        variableOne = scanner.nextInt();
        System.out.println("Enter variable two:");
        variableTwo = scanner.nextInt();


         boolean statementOne = (variableOne >= variableTwo);
         String myVar = Integer.toString(variableOne);
         String myVar2 = Integer.toString(variableTwo);

        System.out.println("The statement " + myVar + " > " + myVar2 + " is " + statementOne);

//        System.out.println("The statement " + variableOne + " > " + variableTwo + " is " + statementOne );

    }
}
