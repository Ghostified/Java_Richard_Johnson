package ChapterFour;

public class EvenNumbersWhile {
    public static void main(String[] args) {


        int x = 0;
        int number = 10;

//        while( number <= 10  && number % 2 == 0){
////              if ( number % 2 == 0){
////                  //System.out.println(number);
////              }
//            System.out.println(number);
//            number++;
//        }


        for( x = 1; x <= 10 ; x++){

            if (x % 2 == 0){
                System.out.println(x);
            }

        }
    }
}
