package ChapterFive;

public class MethodOverloading {
    public static void main(String[] args) {

        //writting the same method with diffeent parameters
        //the method sum takes two parameters in the first method and three in the second
        System.out.println(sum(2 , 3)); //5
        System.out.println(sum(2,3,4)); //9
    }

    public  static int sum (int x, int y){
        return  x + y;
    }
    public static int sum(int y, int x, int z){
        return  x + y + z;
    }
}
