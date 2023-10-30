package AJavaFundamentals;

import java.util.ArrayList;
//Array list helps  in avoiding restrictions around Arrays to mention the size & being rigid entirely.
//Array list will increase or shrink based on the need.
//Arraylist syntax & print methods are different.

public class pArraylist {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList<String>();
        array1.add("Kamal");
        array1.add("Anandh");
        array1.add("Nandhini");
        array1.add("Jothi");
        System.out.println(array1.get(2));
        array1.remove(1);
        System.out.println(array1.get(2));
        int size = array1.size();
        Boolean flag = array1.contains("Jothi");
        Boolean flag1 = array1.contains("Arun");
        System.out.println("Size ="+size+"\nJothi is "+flag+"\nArun is "+flag1);
        array1.clear();
        size = array1.size();
        System.out.println("Size ="+size);
    }
}
