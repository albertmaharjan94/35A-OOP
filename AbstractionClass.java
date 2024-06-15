public class AbstractionClass{
    public static void main(String[] args){

    }
}
// to make abstract class keyword "abstract" before class
abstract class SmartPhone{
    // abstract class may or may not have abstract functions
    // to make abstract function add "abstract" before return type
    // abstract function do not have a body
    abstract void call();
    abstract void message();
    abstract String delivery(String text);
}
// abstract class cannot be instantiated/ cannot make object
// use it in a sub class
class Nokia extends SmartPhone{
    // if we extend abstract class, we must override every
    // abstract function in child class
    @Override
    void call(){
        System.out.println("Nokia calling");
    }
    @Override
    void message(){
        System.out.println("Nokia messaging");
    }
    // Override function have the same return type and parameters
    @Override
    String delivery(String text){
        System.out.println("Text deliverted: " + text);
        return "Text Delivered";
    }
}
// make class Samsung and Apple that extends Smartphone
// make object of Nokia, Samsung and Apple
// call the function message and delivery 
//  - each with have their own implementation

