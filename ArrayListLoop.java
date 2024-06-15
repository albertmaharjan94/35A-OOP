import java.util.ArrayList;
public class ArrayListLoop{
    public static void main(String[] args){
        /* Import the ArrayList at the top from java.util */
        ArrayList<Integer> iArr = new ArrayList<>();
        iArr.add(100);
        iArr.add(200);
        iArr.add(300);
        // To get the size/lenght use .size()
        System.out.println(iArr.size());
        iArr.add(400);
        System.out.println(iArr.size()); // see how size/lenght changes dynamic
        // To loop array list same concept as array
        // loop from 0 - (length -1)
        int iArrLength = iArr.size();
        for(int index = 0; index < iArrLength; index ++){
            int element = iArr.get(index);
            System.out.println("Index " + index + " Value " + element);
        }
        // Using foreach -> loop/iterate only element
        for(Integer element: iArr){
            System.out.println(element);
        }

        /* Task
        * Make a ArrayList animals2 
        * ["Cat", "Tiger", "Dog", "Snake", "Elephant"]
        * Make another 2 ArrayList, wildAnimal and domesticAnimal
        * Loop the animals2
        * if the value is "Cat", "Dog" add in domesticAnimal
        * if value is "Tiger", "Snake", "Elephant" add in wildAnimal
        * Print both wildAnimal and domensticAnimal
        */

       ArrayList<String> animals2 = new ArrayList<>();
       animals2.add("Cat");
       animals2.add("Tiger");
       animals2.add("Dog");
       animals2.add("Snake");
       animals2.add("Elephant");
       ArrayList<String> wildAnimal = new ArrayList<>();
       ArrayList<String> domesticAnimal = new ArrayList<>();
       int animals2Length = animals2.size();
       for(int index = 0 ; index < animals2Length ; index ++ ){
            String elem = animals2.get(index);
            if(elem == "Cat" || elem == "Dog"){
                domensticAnimal.add(elem);
            }else{
                wildAnimal.add(elem);
            }
       }
       // Using forech
       for(String elem: animals2){
            if(elem == "Cat" || elem == "Dog"){
                domensticAnimal.add(elem);
            }else{
                wildAnimal.add(elem);
            }
       }

    }
}