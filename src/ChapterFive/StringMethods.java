package ChapterFive;

public class StringMethods {

    public static void main(String[] args) {
        //charAt - returns a char, character at position i in the argument
        String name = "Branson";
        char firstLetter = name.charAt(0);
        char secondLetter = name.charAt(1);
        System.out.println( firstLetter + " " + secondLetter);

        //compareTo - returns an int, the diffrence in unicode values for the first characters that differ in the string and argument
        String name1 = "Branson";
        String name2 = "Brunch";
        int comparison = name2.compareTo(name1);
        System.out.println(comparison);

        //equals -- returns a boolean, if a string and the argument are equal return true , otherwise false
        String myName = "Branson";
        String secondName = "BRANSON";
        Boolean equate = myName.equals(secondName);
        System.out.println(equate);

        //EqualIgnoreCase -> Returns boolean of true if string and argument are similar igoniring the case
        String noun1 = "Branson";
        String noun2 = "BRANSON";
        Boolean ignoringCase = noun1.equalsIgnoreCase(noun2);
        System.out.println(ignoringCase);

        //indexOf - returns an int the position of the first occurence of a specified char in the string
        String noun3 = "Branson";
        int charIndex = noun3.indexOf(3);
        System.out.println(charIndex);

        //length  - returns an int equal to the number of characters in the strinng , including white spaces
        String noun4 = "Allan Branson";
        int lenghthOfTheString = noun4.length();
        System.out.println(lenghthOfTheString);

        //substring - Returns a string from specified index to a specified index
        String noun5 = "Albus Wulfric";
        String subString1 = noun5.substring(6);
        String subString2 = noun5.substring(6,13);
        System.out.println(subString1);
        System.out.println(subString2);

    }

}
