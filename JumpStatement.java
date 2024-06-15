public class JumpStatement{
    public static void main(String[] args){
        /* break and continue are jump statements*/
        for(int i = 0; i <= 3; i ++ ){
            if(i == 2){
                break;
            }
            System.out.println("Index " + i);
        }
        System.out.println("This will execute after loop ends/break");
        /* can be used in while */
        int count = 0;
        while(count <= 3){
            if(count == 2){
                break;
            }
            System.out.println("While counter " + count);
            count += 1;
        }
        System.out.println("This will execute after while loop ends/break");

        /* Continue will skip the iteration/ goto next loop */
        for(int index = 0; index <= 5; index ++ ){
            if(index == 2){
                continue;
            }
            System.out.println("Continue Loop " + index);
        }
        /* In the above loop when index == 2 the line/statement below it will be skipped */

        /* Task
        * Loop from -5 to 5 
        * If the number is positive end the loop
        * Print number 
        */
        for(int index = -5; index <=5 ; index ++){
            if(index == 0){
                break;
            }
            System.out.println("Negative " + index);
        }
        /* Task
        * Loop from 1-20
        * Only print the number if the number is even
        * Use continue to complete this
        */
        for(int index = 1; index <=20; index ++){
            if(index % 2 != 0){
                continue;
            }
            System.out.println("Even " + index);
        }
    }
}