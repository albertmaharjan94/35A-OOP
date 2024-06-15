public class SwitchClass{
    public static void main(String[] args){
        char charValue = 'b';
        int intValue = 10;
        switch(charValue){
            case 'a':
                System.out.println("Apple");
                break;
            case 'b':
                switch(intValue){
                    case 10:
                        System.out.println("Ten");
                        break;
                    case 20:
                        System.out.println("Twenty");
                        break;
                }
                System.out.println("Ball");
                break;
            case 'c':
                System.out.println("Cat");
                break;
            case 'd':
                System.out.println("Dog");
                break;
            default:
                System.out.println("No Word found");
                break;
        }
        /* Task 
        * Switch case
        * 0 - Sunday
        * 1 - Monday
        * 2 - Tuesday
        * 3 - Wednesday
        * 4 - Thursday
        * 5 - Friday
        * 6 - Saturday
        * any other - Invalid day
        * /
        int day = 2;
        
    }
}