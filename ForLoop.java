public class ForLoop{
    public static void main(String[] args){
        for(int index = 0; index < 4; index ++){
            System.out.println("Looping " + index);
        }
        
        /* Make the table of the following */
        for(int index = 10; index >=0; index --){
            System.out.println("Looping Decrement" + index);
        }

        /* Task 
        * Use loop to make multiplication table of 2
        * Print the following
        * 2 x 1 = 2
        * 2 x 2 = 4
        * ..
        * 2 x 10 = 20
        */
        
        /* Nested for Loop 
        * Loop inside loop */
       for(int outer = 0; outer < 2; outer ++){
            for(int inner = 2; inner >=0; inner--){
                System.out.println("Inner " + inner);
            }
            System.out.println("Ouuter " + outer);
       }
       /* Make a multiplication table like the example
       * Multilpication of 1
       * 1 x 1 = 1
       * 1 x 2 = 2
       * ..
       * 1 x 10 = 10
       * ...
       * Multiplcation of 5
       * 5 x 1 = 5
       * 5 x 2 = 10
       * ..
       * 5 x 10 = 50
       */
      for(int outer = 1; outer <=5; outer ++){
        System.out.println("Multiplication of " + outer);
        for(int inner = 1; inner <=10; inner ++){
            System.out.print(inner);
            System.out.print(" x ");
            System.out.print(outer);
            System.out.print(" = ");
            System.out.println(outer * inner);
        }
      }
    }
}