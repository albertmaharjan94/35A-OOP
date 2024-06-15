public class StaticFunction{
    public static int returnAdd(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static String vendingMachine(int menu){
        if(menu == 1){
            return "Coke";
        }
        if(menu == 2){
            return "Water";
        }
        if(menu == 3){
            return "Frooti";
        }
        return "Invalid Menu";
    }
    /* Task 1
    * Make a function eligibleTest
    * takes name as String, age as int
    * if the age is less than 0, more than 200 return invalid age
    * if the age is below 18, return "Hello name, you are ineligible"
    * else return "Congratulation name, you are eligible"
    */
    public static String eligibleTest(String name, int age){

    }
    /* Task 2
    * Make a function monthCalculator
    * takes month as int
    * returns String
    * 1 - January
    * 2 - Febuary
    * ..
    * 12 - December
    */
    public static String monthCalculator(int month){

    }
    /* Task 3, Make a function checkEqual that takes 2 int and return boolean 
    * if both are equal or not */
    public static boolean checkEqual(int num1, num2 ){

    }
    public static void main(String[] args){
        /* If the function is static on same class
        * can simply call the identifier */
       int returnValue = returnAdd(10, 20);
       System.out.println("Add is " + returnValue);
       String iGet = vendingMachine(1);

       System.out.println("Vending machine returns " + iGet);
    }
}