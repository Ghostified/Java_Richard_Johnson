package ChapterThree_DecisionMaking;

public class CompareCharacters {
    public static void main(String[] args) {
        String one = "A";
        String two = "X";

        Integer comparison = two.compareTo(one);
        String output =  "The diffrence in unicode values for " + one + " and "  + "two " + " is " + comparison;
        System.out.println(output);
    }

}
