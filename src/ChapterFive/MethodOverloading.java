package ChapterFive;

public class MethodOverloading {
    public static void main(String[] args) {

        //writting the same method with diffeent parameters
        //the method sum takes two parameters in the first method and three in the second
        // overloaded methods must have diffrent parameters and can have diffrent return types
        System.out.println(sum(2 , 3)); //5
        System.out.println(sum(2,3,4)); //9

        printSomething();
        printSomething("Welcome to Hogwarts");

    }

    public  static int sum (int x, int y){
        return  x + y;
    }
    public static int sum(int y, int x, int z){
        return  x + y + z;
    }

    public static void printSomething (){
        System.out.println("Hello Ghost");
    }

    public static  void printSomething (String fooBar){
        System.out.println( "Hello " + fooBar);
    }
}
