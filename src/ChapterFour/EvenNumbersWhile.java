package ChapterFour;

public class EvenNumbersWhile {
    public static void main(String[] args) {


        int x = 10;
        int number = 0;

        while( number <= x ){
              if ( number % 2 == 0){
                  System.out.println(number);
              }
            number++;
        }
    }
}
