public class IfElseClass{
    public static void main(String[] args){
        /* If statement */
        if(true){ 
            System.out.println("True Statement");
        }
        // The parenthesis takes a boolean expression
        int num1 = 10, num2 = 20;
        if(num1 == num2){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        /* Note that the else statement is always optional */

        /* If else if */
        if(num1 == num2){
            System.out.println("Equal");
        }else if(num1 < num2){
            System.out.println("Lesser");
        }else{
            System.out.println("Greater");
        }
        /* Note that else should be at the last when using else if */
        /* If else if ladder */
        if(num1 == num2){
            System.out.println("Equal");
        }else if(num1 > num2 ){
            System.out.println("Greater");
        }else if(num1 != num2){
            System.out.println("Not equal");
        }else if(num1 > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Default statement");
        }
        /* When a condition is matched it will skip all the remaining statement */
        /* Nested If else */
        if(num1 > 0){
            if(num1 > num2){
                System.out.println("Positive greater");
            }else{
                System.out.println("Positive lesser");
            }
        }else{
            if(num1 > num2){
                System.out.println("Negative greater");
            }else{
                System.out.println("Negative lesser");
            }
        }
        /* Task
        * Consider the following
        * calculate the total and average and save in variable accordingly
        * if any of the marking is less than 35, print "Fail"
        * if the average is less than 60, print "Third div"
        * if the average is less than 70, print "Second div"
        * if the average is less than 80, print "1st div"
        * if the average is greater than 80, print "Distinction"
        * if the average is negative or over 100, print "Invalid marking"
        * /
        int math = 34, science = 70, english = 50;
        
    }
}