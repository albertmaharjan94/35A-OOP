public class ArrayLoop{
    public static void main(String[] args){
        int[] arrayExample = { 20, 40, 60, 80, 100, 120 };
        // First we need length of array
        int arrayExampleLength = arrayExample.length; // -> 6
        /* for ascending loop 0 - (length -1) -> 0 - 5 */
        for(int index = 0; index < arrayExampleLength; index ++ ){
            int value = arrayExample[index];
            System.out.println("Index " + index + " Value " + value);
        }
        /* Can put condition as index <= arrayExampleLength - 1 */

        /* For descending loop from (length - 1) to 0 decrement 
        * 5 - 0 */
        System.out.println("Decrement/Reversed Loop");
        for(int index = arrayExampleLength - 1; index >= 0 ; index -- ){  
            int value = arrayExample[index];
            System.out.println("Index " + index + " Value " + value);
        }

        /* Task 1 
        * make an array arrayOne with size 4
        * with value [-10, -20, -30, -40]
        * loop the array and print the positive 
        * Output:
        * 10
        * 20
        * 30
        * 40
        */
        int[] arrayOne = { -10, -20, -30, -40 };
        for(int index = 0; index < arrayOne.length ; index ++ ){
            System.out.println(arrayOne[index] * -1);
        }

        String[] names = { "Ram", "Shyam", "John", "Doe" };
        String finder = "John";
        /* Loop the names and find the index of finder - "John"
        * Print the index if found and break the loop
        */
        for(int index = 0 ; index < names.length ; index ++ ){
            if(names[index] == finder){
                System.out.println(index);
                break;
            }
        }
        /* Homework
        * Make a function that takes array of String and String as input
        * If array has any element that equals to input 
        * if element match return index else return -1 is no match is found
        * Function name: arrayFinder
        * Eg: arrayFinder(names, finder)
        */

    }
}