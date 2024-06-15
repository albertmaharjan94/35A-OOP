import java.util.Scanner;
public class DoWhileLoop{
    public static void main(String[] args){
        /* While loop checks the expression at first */
        int num1 = 0;
        while(num1 < 0 ){
            System.out.println("This will not execute");
        }

        /* Do while loop checks the expression after running a loop
        * Which means do while loop runs at least once */
        do{
            System.out.println("Thiw will execute");
        }while(num1 < 0);
        /* Although the expression is the same the do while will execute 
        * at least once */

       int doCount = 0;
        do{
            System.out.println("DO COUNT " + doCount);
            doCount ++;
        }while(doCount <= 5);

        /* Task
        * ask user for number until the number provided is negative
        * you can use while or do while to complete this */
        /* Do while implementation */
        Scanner scan = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter a negative number");
            input = scan.nextInt();
        }while(input > 0);
        scan.close();
       
    }
}