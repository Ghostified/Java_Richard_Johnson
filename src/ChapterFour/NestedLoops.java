package ChapterFour;

//demonstrate Nested Lopps

public class NestedLoops {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++){
//            for (int j = 1; j <= i ; j++){
//                if (i % j  == 0 ){
//                    System.out.println(i + " is divisible by "  +  j );
//                }
//            }
//        }
//        for (int i = 0; i < 10; i++){
//            for (int j = 1; j <= i ; j++){
//                if (i % j  == 0 ){
//                    System.out.println(i + " is divisible by "  +  j );
//                }
//            }
//        }
        for (int i = 0; i < 10; i++){
            for (int j = 1; j <= i ; j++){
                if (i % j  == 0 ){
                    System.out.println(i + " is divisible by "  +  j );
                }
            }
        }

    }
}
