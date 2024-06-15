public class MultiDimArrayLoop{
    public static void main(String[] args){
        int[][] arrayTwo = new int[3][2];
        arrayTwo[0][0] = 10;
        arrayTwo[0][1] = -10;
        arrayTwo[1][0] = 20;
        arrayTwo[1][1] = -20;
        arrayTwo[2][0] = 30;
        arrayTwo[2][1] = -30;
        /* Visual 
        * [
        *   [10, -10], ->0
        *   [20, -20], ->1
        *   [30, -30]  ->2
        * ]
        */
        // first get the length 
        int arrayTwoLength = arrayTwo.length;
        for(int outer = 0; outer < arrayTwoLength; outer ++){
            int innerLength = arrayTwo[outer].length;
            System.out.println("Access array of " + outer);
            for(int inner = 0; inner < innerLength; inner ++){
                System.out.println(arrayTwo[outer][inner]);
            }
        }

        /* Make the following array names
        * [
        *    ["Sabina", "Abhinav", "Anubhav"],
        *    ["Sambanda", "Siddhartha", "Ayush"],
        *    ["Deepika", "Shreetika GPT", "Resha"]
        * ]
        * Find on which indexed array is Shreetika GPT in
        * Output
        * 2
        */
        // String[][] names = new String[3][3];
        String[][] names {
            {"Sabina", "Abhinav", "Anubhav"},
            {"Sambanda", "Siddhartha", "Ayush"},
            {"Deepika", "Shreetika GPT", "Resha"}
        };
        for(int outer = 0; outer < names.length ; outer ++){
            for(int inner = 0; inner < names[outer].length; inner ++){
                if(names[outer][inner] == "Shreetika GPT"){
                    System.out.println(outer);
                }
            }
        }

    }
}