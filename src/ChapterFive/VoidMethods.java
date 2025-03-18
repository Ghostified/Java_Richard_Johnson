package ChapterFive;

public class VoidMethods {
    //void methods do not return a value

    public static void main(String[] args) {
        sayHi();
        System.out.println(multiplyInt(5, 10) + multiplyInt(8 ,5));
    }

    //static keyword is used when the method will be called within the class
    public static void sayHi(){
        System.out.println("Hello Dumbledore");
    }

    //value returning methods - Methods with a return type is the type of data that will be returned
    // return -thatbcan be used to return a value
    public static int multiplyInt( int x, int y){
        return  x * y ;
    }

}
