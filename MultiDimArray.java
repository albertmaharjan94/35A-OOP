public class MultiDimArray{
    public static void main(String[] args){
        /* The number of square bracket determine the dimension */
        // 1 Dim array 
        int[] oneDArray;
        // 2 DIm array
        int[][] twoDArray;
        // 3 Dim Array
        int[][][] threeDArray;

        /* Memory allocation */
        twoDArray = new int[2][3]; 
        /* The first 2 is the number of array inside twoDArray
        * The second 3 is the number of value/length of inner array
        * [
        *   [100,200,0],
        *   [0,100,-100]
        * ]
        */
        twoDArray[0][0] = 100;
        twoDArray[0][1] = 200;
        twoDArray[1][2] = -100;
        twoDArray[1][1] = 100;
        // access value the same way
        int arrayValue = twoDArray[0][0];
        System.out.println(twoDArray[0][1]);

        /* Task create the following array 
        * [
        *    [10,20],
        *    [30, 40],
        *    [50, 60],
        *    [70, 80],
        *    [-10, -20]
        * ]
        * Print the last array
        * Output
        * -10
        * -20
        */

        int[][] twoDArrayValue = {
            {10, 20},
            {30, 40},
            {50, 60},
            {70, 80},
            {-10, -20}
        };
    }
}