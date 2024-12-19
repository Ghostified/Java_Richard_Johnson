package ChapterThree_DecisionMaking;

public class CompareToMethod {
    public static void main(String[] args) {
       StringCompareTo test = new StringCompareTo();
        System.out.println(test);
    }
    private static class StringCompareTo{
        String string1 = "aardvarks", string2 = "aardvarks are cool";
        int comparingStrings = string1.compareTo(string2);

        @Override
        public  String toString(){
            return "string1: " + string1
                    + "string2" + string2
                    + " Comparison Result: " + comparingStrings;
        }
    }
}
