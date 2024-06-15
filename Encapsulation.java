public class Encapsulation{
    public static void main(Stringp[] args){
        Laptop l1 = new Laptop();
        l1.brand = "Apple";
        l1.name = "Apple M1";
        l1.setRam(8);
        l1.setStorage(128);
        l1.price = 150000;
        System.out.println("Name " + l1.name);
        System.out.println("Brand " + l1.brand);
        System.out.println("Ram " + l1.getRam() + "GB");
        System.out.println("Storage " + l1.getStorage() + "GB");
        System.out.println("Price " + l1.price);
        // 
        l1.upgrade(2, 128);
        l1.inflation(20000);
        
    }
}
// 1. Encapsulation bundle/group similar properties 
// and functions in a class
class Laptop{
    // Encapsulation/class contains attributes/properties
    String brand;
    public String name;
    // 2. Encapsulation can contain data-hiding
    // can be done using the access modifier private
    private int ram; 
    private int storage;
    double price;
    // And functions
    void info(){
        System.out.println("Brand " + this.brand + " Name " + this.name);
    }
    // 3. Encapsulation maintains better control read-only or write-only
    // using getter and setter
    void setRam(int ram){
        this.ram = ram;
    }
    int getRam(){
        return this.ram;
    }
    // Make setter and getter for storage
    // Make 2 object of Laptop
    // Output from object
    // Name: Apple M1
    // Brand: Apple
    // Ram: 8GB
    // Storage: 128GB
    // Price: 150000
    // Make a function upgrade that takes ram and storage
    // And add to the current ram and storage
    // Make a function inflation that takes number
    // And increase the price with given number
    void setStorage(int storage){
        this.storage = storage;
    }
    int getStorage(){
        return this.storage;
    }
    void upgrade(int ram, int storage){
        this.ram = this.ram + ram;
        this.storage = this.storage + ram;
    }
    void inflation(double money){
        this.price += money;
    }
}