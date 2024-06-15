public class AccessModifier{
    public static void main(String[] args){
        HumanBeing human = new HumanBeing();
        human.name = "Ram";
        // human.phNumber = "123";
        human.age = 12;
        human.showName();
        // human.showPh(); // private cannot be used outside class
        human.showAge();
        human.func();
        human.setPhNumber("12321");
        String humanNumber = human.getPhNumber();
        System.out.println(humanNumber);
    }
}
// Task
// Make a class Phone
// make 2 private attributes, imei_no, serial_number
// make 2 public attributes, model_no, brand_name
// make setter for imei_no
// make both setter and getter for serial_number
// make a function device_info() -> print(model_no, imei_no and serial_number)
// make 2 object of Phone, set all the attribute
// use getter to print serial_number of both object
// use device_info() on both obj
class Phone{
    private String imei_no;
    private String serial_number;
    public int model_no;
    public String brand_name;
    void setImeiNo(String imei){
        imei_no = imei;
    }
    void setSerialNumber(String serial){
        serial_number = serial; 
    }
    String getSerialNumber(){
        return serial_number;
    }
    void device_info(){
        System.out.println(model_no+ ", " + imei_no + " and " + serial_number);
    }
}

class HumanBeing{
    String name; // automatically default, used within package/folder
    private String phNumber; // can only be used in this class scope aka HumanBeing
    public int age; // can be used anywhere
    // setter -> start with "set" and continue with variable name
    void setPhNumber(String p){
        phNumber = p;
    }
    // getter -> start with "get" and continue with variable name
    String getPhNumber(){
        return phNumber;
    }

    // same is applied in functions
    void showName(){
        System.out.println(name);
    }
    private void showPh(){
        System.out.println(phNumber);
    }
    public void showAge(){
        System.out.println(age);
    }
    void func(){
        System.out.println(phNumber); // private can only be accessed within the class
        showPh(); // same goes to private function
    }
}