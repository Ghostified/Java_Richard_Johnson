package ChapterFive;

//Program to print prime numbers between two numbers e.g 1 and 50
public class MethodsExerciseTwo {
    public static void main(String[] args) {

        findPrimeBetween(10 , 20);
    }

    //Method to loop through the start and end
    public static void findPrimeBetween(int start , int end){


        for(int i = start; i <= end ; i++){

            if (isPrime(i)){
                System.out.println(i + " ");
            }
        }

    }

    //method to find a prime
    public  static  boolean isPrime(int n ){
         for ( int i = 2; i <= n/2; i++){
             if (n % i == 0){
                 return false;
             }
         }
         return true;
    }









}
