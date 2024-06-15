public class ConstructorRevise{
    public static void main(String[] args){
        NonParamConstructor np = new NonParamConstructor();
        System.out.println(np.name);
        ParamConstructor pc = new ParamConstructor("Ktm", "980123213", 'M');
        System.out.println(pc.address);
        // pc.gender;
        System.out.println(pc.getGender());
        pc.setGender('F');
        System.out.println(pc.getGender());
        
        Book b = new Book(100.2);
        b.setName("XYZ");
        b.setAuthor("Ram bahudur");
        b.year = 2010
        b.publication = "Sof";
        System.out.println("Name " + b.getName());
        System.out.println("Price " + b.getPrice());
        System.out.println("Author " + b.getAuthor());
        System.out.println("Year " + b.year);
        System.out.println("Publication " + b.publication);
    }
}
// Make a class Book
// Make 3 private properties: author, name and price
// Make 2 public properties: publication and year
// Using "this"
// Make a constructor that sets price only
// make setter for auther and name only
// make getter for all the private attributes
// make 2 objects of Book
// print the following from both object
// Title: xyz
// Author: abc
// Publication: 123 publication
// Year: 2010
// Price: 10.22
class Book{
    private String author, name;
    private double price;
    public String publication;
    public int year;
    Book(double price){
        this.price = price;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setName(String name){
        this.name = name;
    }
    double getPrice(){
        return this.price;
    }
    String getAuthor(){
        return this.author;
    }
    String getName(){
        return this.name;
    }
}


class ParamConstructor{
    String address;
    private String phNo;
    private char gender;
    void setGender(char gender){
        this.gender = gender;
    }
    char getGender(){
        return this.gender;
    }
    // Parameterized constructor takes arguement inside ()
    ParamConstructor(String address, String phNo, char gender){
        System.out.println("This also runs when creating object");
        this.address = address;
        this.phNo = phNo;
        this.gender = gender;
    }
}
class NonParamConstructor{
    String name;
    private int age;
    // Non parameterized constructor does not take any arguement/parameters
    // To make constructor make same function of class Name without return type
    NonParamConstructor(){
        System.out.println("Runs when creating objects");
        // can be used to set default value
        this.age = 20;
        this.name = "Default Name";
    }
}