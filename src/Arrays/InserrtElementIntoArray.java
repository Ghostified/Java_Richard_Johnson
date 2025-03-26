package Arrays;
/*
* Inserting an element into an array
*
* */
public class InserrtElementIntoArray {
    public static void main(String[] args) {
        //1: define original array and print
        Integer [] originalArray = {1,2,3,4,5};


        //2: define the element to be inserted in the array and the index to be inserted
        Integer elementToInsert = 56;
        Integer insertionIndex = 3;

        //3; call the insertion method
        Integer [] finalArray  = insertElement(originalArray, elementToInsert, insertionIndex);

        //4: print original array and final array after inserting the new element
        System.out.println("The original array is: ");
        printArray(originalArray);
        System.out.println(" ");
        System.out.println("The final array after insertion is: ");
        printArray(finalArray);

    }
    //method to print array elements
    public  static <T> void printArray( T  [] Arrays){
        if (Arrays == null)
        {
            System.out.println("Array is empty ");
            return;
        }
        //System.out.println("The elements in the array are: ");
        for(int i = 0; i < Arrays.length; i++)
        {
            System.out.print( Arrays[i] + " ");
        }

    }

    //Array insertion method should return the new array
    public static  Integer [] insertElement (Integer [] array, Integer element, Integer index){
        //1: create a new array of size one greater than original array
        Integer [] newArray = new Integer[array.length + 1];

        //2: copy all the elements before the insertion index into the new array
        for (int i = 0;  i < index; i++)
        {
            newArray[i] = array[i];
        }

        //3: insert the new element at specified index
        newArray[index] = element;

        //4: copy elements after the insertion index
        for(int i = index; i < array.length; i++)
        {
            newArray[i + 1] = array [i];
        }

        //5: Return the new Array
        return  newArray;
    }
}
