public class InheritanceConstructor{
    public static void main(String[] args){
        Polo p = new Polo();
        p.colorDifference("Red");
        // If constructor is overloaded, pass the corresponding params
        Shirt shirt1 = new Shirt(); // non param constrcutor
        Shirt shirt12 = new Shirt("Red",10); // constructer that takes int
    }
}
class Shirt{
    String color = "White"; // super.color
    Shirt(){
        System.out.println("Parent Default");
    }
    // Contructor Overloading
    // Same Constructor/Function with different logic/params
    Shirt(String color){
        this.color = color;
    }
    Shirt(int price){
        System.out.println("Price " + price);
    }
    Shirt(String color, int price){
        System.out.println("Color and Price" + color + " " + price);
    }
}
class Polo extends Shirt{
    String color = "Black"; // this.color
    Polo(){
        // The default constructor is run in first execution
        // super() i.e. Shirt() is ran automatically here
        super("Yellow");
        System.out.println("Child Default");
    }
    void colorDifference(String color){
        System.out.println("Parameter color " + color);
        System.out.println("Class color " + this.color);
        System.out.println("Parent color " + super.color);
    }
}
// Task
// Make a class Pant
// Add two attribute color and texture
// Make constructor or Pant that takes color and texture 
// Make a class HalfPant that extends Pant
// Make a attribute color and add default String White
// Make a non param constructor of HalfPant and \
// call the Parameterized constructor of parent Pant with "Black" and "Wool"
// Make a function design() in HalfPant that takes String color \
// change the parent color to current color of halfpant
// change the current color of half pant to provided parameter
class Pant{
    String color;
    String texture;
    Pant(String color, String texture){
        this.color = color;
        this.texture = texture;
    }
}
class HalfPant extends Pant{
    String color = "White";
    HalfPant(){
        super("Black", "Wool");
    }
    void design(String color){
        super.color = this.color;
        this.color = color;
    }
}


/* 
1. Write a Java program to create a class called Vehicle with a method called drive().
Create a subclass called Car with method display() method to print details of the Car.

6. Let's examine the Java program given.
It involves multiple classes that depict different book types,
including Book, FictionBook, NonFictionBook, and TechnicalBook.
The Book class features a constructor and a method called displayDetails().
This method is responsible for outputting the title and author of a book.
The remaining classes inherit both the constructor 
and methods of the Book class as they extend it.
*/