public class FirstOop{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "Ram";
        p1.age = 10;
        p1.address = "KTM";
        p1.gender = 'M';

        p1.greet();

        Person p2 = new Person();
        p2.name = "Sh";
        p2.age = 20;
        p2.address = "Bhatkapur";
        p2.gender = 'F';
        p2.greet();

        Square s1 = new Square();
        s1.side = 10;
        double s1Area = s1.area();
        System.out.println(s1Area);
        System.out.println(s1.area());
    }
}

// add attribute name, brand, color, year 
// make a function expiry, that adds 100 to year and return the date
// make a function modify that takes String and change the color of class
// make a function start() -> print(name is starting)
// make a function stop() -> print(name, year is stopping)
// make a function detail() -> print(name, brand, color and year)
// Make 3 objects of car
// Fill all attribute of 3 
// print expiry of all car objects
// start the first object car
// modify 1st and 3rd object
// stop the 2nd and 3rd object car
// run detail in all objects
class Car{
    String name;
    String brand;
    String color;
    int year;
    int expiry(){
        return year + 100;
    }
    void modify(String c){
        color = c;
    }
    void start(){
        System.out.println(name + " is starting");
    }
    void stop(){
        System.out.println(name + ", " + year + " is stopping");
    }
    void detail(){
        System.out.println(name + "," + brand + "," + color + " and " + year );
    }
}

// Task create a class Rectangle
// Add attribute length and breadth
// Make a function that returns area
// Make a function that returns perimeter
// Make a function info, that prints lenght and breath of rectangle
// Make an object of Rectanle and print area, perimeter and info

class Square{
    double side;

    double area(){
        return side * side;
    }
}

class Person{
    String name;
    int age;
    String address;
    char gender;

    void greet(){
        System.out.println("Name " + name + " Age " + age);
    }
    void sleep(){
        System.out.println("Person is sleeping");
    }
}
