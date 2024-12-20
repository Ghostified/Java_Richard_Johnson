package ChapterThree_DecisionMaking;

public class CompareToMethod {
    public static void main(String[] args) {
       StringCompareTo test = new StringCompareTo();
        System.out.println(test);
        StringEqualsTo test2 = new StringEqualsTo();
        System.out.println(test2);
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

    //Returns a boolean value of true or false
    private static class StringEqualsTo{
        String string1 = "Albus" , string2 = "Dumbledore";
        boolean comparison = string1.equals(string2);

        @Override
        public String toString(){
            return "String1: " + string1
                    + ", String2: " + string2
                    + ", Equals Result: " + comparison;
        }
    }
}
