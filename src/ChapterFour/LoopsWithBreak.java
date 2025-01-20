package ChapterFour;

public class LoopsWithBreak {
    public static void main(String[] args) {

        //loop with break
//        for (int i = 1; i <= 10 ; i++){
//
//            if (i == 5)
//                break;
//
//                for (int j = 1; j <=  i; j++) {
//                    if ( i % j == 0 ){
//                        System.out.println( i + " is divisible by " + j);
//                    }
//                }
//
//        }

        //Loop with a continue statement;
        for (int i = 1; i <= 10 ; i++){

            if (i == 5)
                continue;

            for (int j = 1; j <=  i; j++) {
                if ( i % j == 0 ){
                    System.out.println( i + " is divisible by " + j);
                }
            }

        }
    }
}
