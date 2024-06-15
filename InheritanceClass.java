public class InheritanceClass{
    public static void main(String[] args){
        ChildClass cc = new ChildClass();
        cc.lastname = "XYZ";
        cc.firstname = "ABC";
        cc.address = "123";
        cc.savings = 10000;
        cc.initials();
        cc.info();

        GrandChildClass gc = new GrandChildClass();
        gc.firstname = "XYZ";
        gc.middlename = "QWE";
        gc.lastname = "ABC";
        gc.initials();
        gc.detail();
    }
}
class ParentClass{
    String lastname;
    private int salary; 
    // the inherited class can use any properties except for private
    // as previously studied private is only class based
    public String address;
    protected int savings;
    void initials(){
        System.out.println("Lastname " + lastname);
    }
}
// extends keyword is used to inherit other class
// single level contains one parent and one child
class ChildClass extends ParentClass{
    String firstname;
    void info(){
        System.out.println("Name " + firstname + " " + lastname);
    }
}
// multilevel childclass has another child class
// GrandChild inherits every attribute build on top of ChildClass
// meaning GrandChild also inherits ParentClass
class GrandChildClass extends ChildClass{
    String middlename:
    void detail(){
        System.out.println("Name " + firstname + " " + middlename + " " + lastname);
    }
}
// Tree
// One class has multiple subclass
class BrotherClass extends ParentClass{
    String location;
    void intro(){
        System.out.println(location + " " + lastname);
    }
}

class Animal{
    String name;
    void speak(){
        System.out.println("I speak");
    }
}
class Mammal extends Animal{
    int legs;
    void fur(){
        System.out.println("Furr");
    }
}
class Reptile extends Animal{
    int eggs;
    void shed(){
        System.out.println("Shedding");
    }
}
class Amphibian extends Reptile{
    int gills;
    void breathe(){
        System.out.println("Breathe");
    }
}
class Dog extends Mammal{
    int diet;
    void bark(){
        System.out.println("Bow");
    }
}
class Cat extends Mammal{
    void meow(){
        System.out.println("Meow");
    }
}
class Labrador extends Dog{
    String color;
    void size(){
        System.out.println("Big");
    }
}
class GermanShepard extends Dog{
    String breed;
    void spotted(){
        System.out.println("Yes");
    }
}