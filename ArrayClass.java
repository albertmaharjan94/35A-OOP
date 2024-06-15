public class ArrayClass{
    public static void main(String[] args){
        /* Array declaration */
        int[] myFirstArray;
        myFirstArray = new int[2]; // 2 represent size
        /* Array declaration and memory allocation */
        int[] mySecondArray = new int[3];
        /* Array declaration, memory allocation and initialization */
        int[] myThirdArray = {10, 20, 30, 40, 50};
        /* .length is used to see the size/value count of array */
        int myThirdArrayLength = myThirdArray.length;
        System.out.println("Third array has " + myThirdArrayLength);

        int[] arrayExample = new int[5]; 
        arrayExample[0] = 10;
        arrayExample[1] = 20;
        System.out.println(arrayExample[0]);
        /* Note that index cannot be more that last index 
        * For eg: arrayExxample[100] will throw error/exception
        */

        /* Make an array myFifthArray with length 4
        * Add the value like [-40, -50, -60, -70]
        * Print each element of myFifthArray
        * Note: Just use index not loop to perform 
        */
        int[] myFifthArray = new int[4];
        myFifthArray[0] = -40;
        myFifthArray[1] = -50;
        myFifthArray[2] = -60;
        myFifthArray[3] = -70;
        System.out.println(myFifthArray[0]); // print to 3 index

        /* Now print the value adding -100 to each
        * Output should be 
        * -140, -150, -160, -170 */
        System.out.println(myFifthArray[0] + -100); // continue to 3


    }
}