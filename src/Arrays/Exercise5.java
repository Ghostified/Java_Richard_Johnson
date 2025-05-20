package Arrays;

import java.util.Arrays;

//re-organize array, with odd numbers first , followed by even numbers
public class Exercise5 {

    public static void main(String[] args) {

        int numbers [] = {2,5,3,4,9,8,7,6,-2};
        int nums [] = {5,9,2,6,7,8,9,4};

        sortArray(numbers);
        sortArrayMethodTwo(nums);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));
    }

    public static void sortArray(int initialArray[]) {
        int temp [] = new int[initialArray.length];
        int j = 0;
        int k = initialArray.length - 1;

        for (int i =0; i < initialArray.length ; i++){
            if (initialArray[i] % 2 != 0 ){
                temp[j++] = initialArray[i];
            } else {
                temp[k--] = initialArray[i];
            }
        }

        //copy temp back to the initial array
        for(int i = 0; i < initialArray.length; i++){
            initialArray[i] = temp[i];
        }

    }

    public static void sortArrayMethodTwo(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Move left pointer if current number is odd (correct place)
            if (array[left] % 2 != 0) {
                left++;
            }
            // Move right pointer if current number is even (correct place)
            else if (array[right] % 2 == 0) {
                right--;
            }
            // If left is even and right is odd, swap them



            else {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;

            }

//             else {
//                int temp = array[left];
//                array[left] = array[right];
//                array[right] = temp;
//
//                left++;
//                right--;
//
//            }



            }
        }
    }



}
