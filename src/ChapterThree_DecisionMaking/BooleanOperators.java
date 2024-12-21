package ChapterThree_DecisionMaking;

public class BooleanOperators {
    public static void main(String[] args) {
        boolean expression1 = ( 5 > 4); // returns true
        boolean expression2 = !expression1; // returns false
        System.out.println(expression2 + "\n"); //returns false

        //&& only returns true if both operands  in an expression are true
        // || logical or returns false only if both opearands are false

        String name1 = "Jones", name2 = "Smith";
        boolean expression3 = name1.equals(name2);
        System.out.println(expression3 + "\n"); // returns false
        boolean expression4 = expression1 && expression3;
        System.out.println(expression4 + "\n"); //returns false
        boolean expression5 = expression1 || expression4 ;
        System.out.println(expression5);//returns true




    }
}
