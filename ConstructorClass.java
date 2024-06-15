public class ConstructorClass{
    public static void main(String[] args){
        ConstructorExample ce = new ConstructorExample(10, "D2");
        System.out.println("Afer object");
        ConstructorTwo ct = new ConstructorTwo("Ram", 24);
        ct.info();
    }
}
class ConstructorTwo{
    // make 2 private attribute name and age
    // make constructor that sets both name and age
    // make function info() -> print(name and age)
    // make an Object and run info() function
    private String name;
    private int age;
    ConstructorTwo(String n, int a){
        name = n;
        age = a;
    }
    void info(){
        System.out.println(name + " and " + age);
    }
}
class ConstructorExample{
    public int data1;
    private String data2;

    // Constructor should be the same name as class name
    // No return type
    ConstructorExample(int d1, String d2){
        data1 = d1;
        data2 = d2;
        System.out.println("I run while making object");
    }
}