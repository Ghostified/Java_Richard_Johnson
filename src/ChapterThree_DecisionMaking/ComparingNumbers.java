package ChapterThree_DecisionMaking;
 /*
 * Comparing Numbers
 * Purpose: cCompare numbers with different data types using logical expressions
 * */
public class ComparingNumbers {
    public static void main(String[] args) {
        //Formal Logical Comparisons
        byte aByte = 5;
        short aShort = -9765;
        int anInt = 5000;
        long aLong = 6388393920201L;
        float aFloat = 5.0F;
        double aDouble = 3.141596535897;
        char char1 = 'A', char2 = 'B', char3 ='a';

        boolean longFloatComparison = (aLong == aFloat),
                byteIntComparison = (aByte <= anInt),
                doubleShortComparison = (aDouble != aShort),
                charComparison1 = (char1 == char2),
                charComparison2 = ( char3 == char2);
        boolean expression = 15 % 4 * 7 + 15 >= 1 || 7 < 12 || !  (-8 != 7 && 7 <= 10 && 5 > 7);

        //Print results
        System.out.println("Compare long and float: " + longFloatComparison);
        System.out.println("Compare bytes and integers " + byteIntComparison);
        System.out.println("Compare doubles and short " + doubleShortComparison);
        System.out.println("Compare char1 & char2 " + charComparison1);
        System.out.println("Compare char3 to char1 " + charComparison2);
        System.out.println("Value of the long expression " + expression);

    }
}
