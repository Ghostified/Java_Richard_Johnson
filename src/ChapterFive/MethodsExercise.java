package ChapterFive;

import java.util.Scanner;

public class MethodsExercise {


    //write a method that gets the name of the user
    //method that gets the age of the user
    public static void main(String[] args) {

        System.out.println("Enter your name and age: ");
        System.out.println("Your name is "+ getName() + " and your age is  " + getAge());

    }

    public static  String getName(){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }

    public  static  int getAge (){
      Scanner input = new Scanner(System.in);
      int age = input.nextInt();
      return age;
    }
}
